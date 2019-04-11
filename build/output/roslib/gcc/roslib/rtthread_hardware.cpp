/*
 * File      : rtthread_hardware.cpp
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-01-22     Pinkie.Fu    initial version
 */

#include "rtthread_hardware.h"
#include "rtthread.h"
#include "ros.h"
#include "lwip/netdb.h"
#include "lwip/sockets.h"

#define DEFAULT_PORTNUM 11411

namespace ros
{
RTThreadHardware::RTThreadHardware ()
  : sockfd(RT_NULL)
{
  connected_ = true;
  rt_kprintf("RTThreadHardware.\n");
  rt_memset(server_hostname_, 0, sizeof(server_hostname_));
}

RTThreadHardware::~RTThreadHardware ()
{
  rt_kprintf("~RTThreadHardware.\n");
  if (sockfd > 0)
  {
    lwip_close(sockfd);
    sockfd = RT_NULL;
  }
}

void RTThreadHardware::init ()
{
  rt_kprintf("RTThreadHardware::init ().\n");
}

rt_bool_t RTThreadHardware::socketInit(char *server_hostname)
{
  struct sockaddr_in serv_addr;
  struct hostent *server;
  int rv;

  // Split connection string into IP address and port.
  const char* tcpPortNumString = strchr(server_hostname, ':');
  long int tcpPortNum;
  char ip[16];
  struct hostent *host;
  host = gethostbyname(server_hostname);

  if(sockfd != RT_NULL){
    lwip_close(sockfd);
    sockfd = RT_NULL;
  }

  if (!tcpPortNumString)
  {
    tcpPortNum = DEFAULT_PORTNUM;
    strncpy(ip, server_hostname, 16);
  }
  else
  {
    tcpPortNum = strtol(tcpPortNumString + 1, NULL, 10);
    strncpy(ip, server_hostname, tcpPortNumString - server_hostname);
  }

  rt_kprintf("Connecting to TCP server at %s:%ld....\n", ip, tcpPortNum);

  // Create the socket.
  sockfd = socket(AF_INET, SOCK_STREAM, 0);
  if (sockfd < 0)
  {
    rt_kprintf("ERROR opening socket.");
    connected_ = false;
    return RT_FALSE;
  }

  // Disable the Nagle (TCP No Delay) algorithm.
  int flag = 1;
  rv = setsockopt(sockfd, IPPROTO_TCP, TCP_NODELAY, (char *)&flag, sizeof(flag));
  if (rv == -1)
  {
    rt_kprintf("Couldn't setsockopt(TCP_NODELAY).\n");
    lwip_close(sockfd);
    sockfd = RT_NULL;
    connected_ = false;
    return RT_FALSE;
  }

  // Connect to the server
  server = gethostbyname(ip);
  if (server == NULL)
  {
    rt_kprintf("ERROR, no such host.\n");
    lwip_close(sockfd);
    sockfd = RT_NULL;
    connected_ = false;
    return RT_FALSE;
  }

  serv_addr.sin_family = AF_INET;
  serv_addr.sin_port =  htons(tcpPortNum);
  serv_addr.sin_addr = *((struct in_addr *)host->h_addr);
  rt_memset(&(serv_addr.sin_zero), 0, sizeof(serv_addr.sin_zero));

  if (connect(sockfd, (struct sockaddr *) &serv_addr, sizeof(struct sockaddr)) < 0)
  {
    rt_kprintf("ERROR connecting!\n");
    lwip_close(sockfd);
    sockfd = RT_NULL;
    connected_ = false;
    return RT_FALSE;
  }

  int flags;
  if ((flags = lwip_fcntl(sockfd, F_GETFL, 0)) != -1)
  {
    lwip_fcntl(sockfd, F_SETFL, flags | O_NONBLOCK);
  }
  rt_kprintf("Connected to server %s!\n", server_hostname);
  return RT_TRUE;
}
void RTThreadHardware::init (char *server_hostname)
{

  rt_strncpy(server_hostname_,server_hostname,sizeof(server_hostname_));
  socketInit(server_hostname_);
  rt_thread_delay(RT_TICK_PER_SECOND);
}

int RTThreadHardware::read ()
{
  unsigned char c;
  unsigned int i;
  int rv;

  if(sockfd == RT_NULL){
    socketInit(server_hostname_);
    return -1;
  }
  rv = lwip_read(sockfd, &c, 1); // read one byte
  i = c;  // convert byte to an int for return
  if (rv > 0)
  {
    return i;  // return the character read
  }

  if (rv < 0)
  {
    if ((errno != EAGAIN) && (errno != EWOULDBLOCK) && (errno != EINTR))
    {
      rt_kprintf("RTThreadHardware::read () error: (%d).\n", errno);
      connected_ = false;
    }
  }
  else
  {
    rt_kprintf("RTThreadHardware::read () peer socket close: (%d).\n", errno);
    connected_ = false;
    rv = -1;
  }

  // return -1 or 0 either if we read nothing, or if read returned negative
  return rv;
}

void RTThreadHardware::write (const unsigned char *data, int length)
{
  int rv;
  int len = length;
  int totalsent = 0;
  if(sockfd == RT_NULL){
    socketInit(server_hostname_);
    return;
  }
  while (totalsent < len)
  {
    rv = lwip_write(sockfd, data + totalsent, (len-totalsent));
    if (rv < 0)
    {
      if ((errno != EAGAIN) && (errno != EWOULDBLOCK) && (errno != EINTR))
      {
        rt_kprintf("RTThreadHardware::read () error: (%d).\n", errno);
        connected_ = false;
        return;
      }
      else
        rt_kprintf("RTThreadHardware::write(): error writing - trying again - \n");
    }
    else if (rv == 0)
    {
      rt_kprintf("RTThreadHardware::read () peer socket close: (%d).\n", errno);
      connected_ = false;
      return;
    }
    else
    {
      totalsent += rv;
    }
  }
}

unsigned long RTThreadHardware::time ()
{
  return rt_tick_get();
}

bool RTThreadHardware::connected()
{
    return connected_;
}
}
