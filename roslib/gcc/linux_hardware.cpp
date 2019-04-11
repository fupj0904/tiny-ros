/*
 * File      : linux_hardware.c
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#if defined(linux) || defined(__linux__) || defined(__linux) || defined(__MACH__) || defined(__CYGWIN__)
#include "linux_hardware.h"
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <errno.h>
#include <termios.h>
#include <string.h>
#include <time.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netinet/tcp.h>
#include <netdb.h>
#include <assert.h>

#define DEFAULT_PORTNUM 11411

static bool connected_ = true;

static void error(const char *msg)
{
  connected_ = false;
  perror(msg);
}

static int set_nonblock(int socket)
{
  int flags;
  flags = fcntl(socket, F_GETFL, 0);
  if (flags != -1)
    fcntl(socket, F_SETFL, flags | O_NONBLOCK);
  return flags;
}

static int elCommInit(const char *portName)
{
  int sockfd;
  struct sockaddr_in serv_addr;
  struct hostent *server;
  int rv = -1;

  // Split connection string into IP address and port.
  const char* tcpPortNumString = strchr(portName, ':');
  long int tcpPortNum;
  char ip[16];
  if (!tcpPortNumString)
  {
    tcpPortNum = DEFAULT_PORTNUM;
    strncpy(ip, portName, 16);
  }
  else
  {
    tcpPortNum = strtol(tcpPortNumString + 1, NULL, 10);
    strncpy(ip, portName, tcpPortNumString - portName);
  }

  printf("Connecting to TCP server at %s:%ld....\n", ip, tcpPortNum);

  // Create the socket.
  sockfd = socket(AF_INET, SOCK_STREAM, 0);
  if (sockfd < 0)
  {
    error("ERROR opening socket");
    return rv;
  }

  // Disable the Nagle (TCP No Delay) algorithm.
  int flag = 1;
  rv = setsockopt(sockfd, IPPROTO_TCP, TCP_NODELAY, (char *)&flag, sizeof(flag));
  if (rv == -1)
  {
    error("Couldn't setsockopt(TCP_NODELAY)");
    close(sockfd);
    return rv;
  }

  // Connect to the server
  server = gethostbyname(ip);
  if (server == NULL)
  {
    error("ERROR, no such host");
    close(sockfd);
    return -1;
  }
  bzero((char *) &serv_addr, sizeof(serv_addr));
  serv_addr.sin_family = AF_INET;
  bcopy((char *)server->h_addr,
        (char *)&serv_addr.sin_addr.s_addr,
        server->h_length);
  serv_addr.sin_port = htons(tcpPortNum);
  if (connect(sockfd, (struct sockaddr *) &serv_addr, sizeof(serv_addr)) < 0)
  {
    error("ERROR connecting");
    close(sockfd);
    return -1;
  }

  if (set_nonblock(sockfd) == -1)
  {
    error("ERROR set_nonblock");
    close(sockfd);
    return -1;
  }

  printf("connected to server\n");
  return sockfd;
}

static int elCommRead(int fd)
{
  unsigned char c;
  unsigned int i;
  int rv;
  rv = read(fd, &c, 1); // read one byte
  i = c;          // convert byte to an int for return
  if (rv > 0)
    return i;     // return the character read

  if (rv < 0)
  {
    if ((errno != EAGAIN) && (errno != EWOULDBLOCK) && (errno != EINTR))
    {
      error("elCommRead() error:");
      close(fd);
    }
  }
  else
  {
    error("elCommRead() socket close:");
    close(fd);
    rv = -1;
  }

  // return -1 or 0 either if we read nothing, or if read returned negative
  return rv;
}

static int elCommWrite(int fd, uint8_t* data, int len)
{
  int rv;
  int length = len;
  int totalsent = 0;
  while (totalsent < length)
  {
    rv = write(fd, data + totalsent, length);
    if (rv < 0)
    {
      if ((errno != EAGAIN) && (errno != EWOULDBLOCK) && (errno != EINTR))
      {
        error("elCommWrite error:");
        close(fd);
        return rv;
      }
      else
        perror("write(): error writing - trying again - ");
    }
    else if (rv == 0)
    {
      error("elCommWrite socket close:");
      close(fd);
      return -1;
    }
    else
    {
      totalsent += rv;
    }
  }
  return rv;
}

LinuxHardware::LinuxHardware ()
{
  connected_ = true;
}

void LinuxHardware::init(const char *pName)
{
  fd = elCommInit(pName);
  initTime();
}

int LinuxHardware::read()
{
  int c = elCommRead(fd);
  return c;
}

void LinuxHardware::write(uint8_t* data, int length)
{
  elCommWrite(fd, data, length);
}

bool LinuxHardware::connected()
{
  return connected_;
}
#endif
