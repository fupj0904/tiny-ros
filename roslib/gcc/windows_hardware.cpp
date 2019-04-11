/*
 * File      : windows_hardware.cpp
 * This file is part of tiny_ros
 *
 * Change Logs:
 * Date           Author       Notes
 * 2018-04-24     Pinkie.Fu    initial version
 */

#if defined(WIN32) || defined(_WIN32) || defined(__WIN32__)
#include "windows_hardware.h"
#include <string>
#include <iostream>
#include <winsock2.h>
#include <ws2tcpip.h>

#pragma comment(lib, "Ws2_32.lib")

#define DEFAULT_PORT "11411"

using std::string;
using std::cerr;
using std::endl;


class WindowsHardwareImpl
{

public:

  WindowsHardwareImpl ()
    : mySocket (INVALID_SOCKET), connected_ (true)
   { }

  void init (char *server_hostname)
  {
    WSADATA wsaData;
    int result = WSAStartup (MAKEWORD (2, 2), &wsaData);
    if (result)
    {
      // TODO: do something more useful here with the error code
      std::cerr << "Could not initialize windows socket (" << result << ")" << std::endl;
      connected_ = false;
      return;
    }

    struct addrinfo *servers = get_server_addr (server_hostname);

    if (NULL == servers)
    {
      WSACleanup ();
      connected_ = false;
      return;
    }

    connect_to_server (servers);

    freeaddrinfo (servers);

    if (INVALID_SOCKET == mySocket)
    {
      std::cerr << "Could not connect to server" << std::endl;
      WSACleanup ();
      connected_ = false;
    }
  }

  int read ()
  {
    char data;
    int result = recv (mySocket, &data, 1, 0);
    if (result < 0)
    {
      int error = WSAGetLastError();
      if ((error != WSAEWOULDBLOCK) && (error != WSAEINTR))
      {
        std::cerr << "Failed to receive data from server " << WSAGetLastError() << std::endl;
        closesocket (mySocket);
        WSACleanup ();
        connected_ = false;
      }
      return result;
    }
    else if (result == 0)
    {
      std::cerr << "Connection to server closed" << std::endl;
      closesocket (mySocket);
      WSACleanup ();
      connected_ = false;
      return -1;
    }
    return (unsigned char) data;
  }

  void write (const unsigned char *data, int length)
  {
    int result = send (mySocket, (const char *) data, length, 0);
    if (SOCKET_ERROR == result)
    {
      std::cerr << "Send failed with error " << WSAGetLastError () << std::endl;
      closesocket (mySocket);
      WSACleanup ();
      connected_ = false;
    }
  }

  unsigned long time ()
  {
    SYSTEMTIME st_now;
    GetSystemTime (&st_now);
    unsigned long millis = st_now.wHour * 3600000 +
                           st_now.wMinute * 60000 +
                           st_now.wSecond * 1000 +
                           st_now.wMilliseconds;
    return millis;
  }

  bool connected()
  {
    return connected_;
  }

protected:
  struct addrinfo *get_server_addr (const string & hostname)
  {
    int result;
    struct addrinfo *ai_output = NULL;
    struct addrinfo ai_input;

    // split off the port number if given
    int c = hostname.find_last_of (':');
    string host = hostname.substr (0, c);
    string port = (c < 0) ? DEFAULT_PORT : hostname.substr (c + 1);

    ZeroMemory (&ai_input, sizeof (ai_input));
    ai_input.ai_family = AF_UNSPEC;
    ai_input.ai_socktype = SOCK_STREAM;
    ai_input.ai_protocol = IPPROTO_TCP;

    // Resolve the server address and port
    result = getaddrinfo (host.c_str (), port.c_str (), &ai_input, &ai_output);
    if (result != 0)
    {
      std::cerr << "Could not resolve server address (" << result << ")" << std::endl;
      return NULL;
    }
    return ai_output;
  }

  void connect_to_server (struct addrinfo *servers)
  {
    int result;
    for (struct addrinfo * ptr = servers; ptr != NULL; ptr = ptr->ai_next)
    {
      mySocket = socket (ptr->ai_family, ptr->ai_socktype, ptr->ai_protocol);
      if (INVALID_SOCKET == mySocket)
      {
        std::cerr << "Could not great socket " << WSAGetLastError ();
        return;
      }

      result = connect (mySocket, ptr->ai_addr, (int) ptr->ai_addrlen);
      if (SOCKET_ERROR == result)
      {
        closesocket (mySocket);
        mySocket = INVALID_SOCKET;
      }
      else
      {
        break;
      }
    }

    // disable nagle's algorithm
    char value = 1;
    setsockopt (mySocket, IPPROTO_TCP, TCP_NODELAY, &value, sizeof (value));
    // disable blocking
    u_long iMode = 1;
    result = ioctlsocket (mySocket, FIONBIO, &iMode);
    if (result)
    {
      std::cerr << "Could not make socket nonblocking " << result << std::endl;
      closesocket (mySocket);
      mySocket = INVALID_SOCKET;
    }
  }
private:
  SOCKET mySocket;
  bool connected_;
};

WindowsHardware::WindowsHardware ()
{
  impl = new WindowsHardwareImpl ();
}

void WindowsHardware::init (char *server_hostname)
{
  impl->init (server_hostname);
}

int WindowsHardware::read ()
{
  return impl->read ();
}

void WindowsHardware::write (const unsigned char *data, int length)
{
  impl->write (data, length);
}

unsigned long WindowsHardware::time ()
{
  return impl->time ();
}

bool WindowsHardware::connected ()
{
  return impl->connected ();
}
#endif
