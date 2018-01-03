# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-2 下午8:04'
import sys
import socket
import time
import gevent

from gevent import socket, monkey

def func():
    pass

monkey.patch_all()

def server(port):
    s = socket.socket()
    s.bind(('0.0.0.0', port))
    s.listen(500)
    while True:
        cli, addr = s.accept()
        gevent.spawn(handle_request, cli)


def handle_request(conn):
    try:
        while True:
            data = conn.recv(1024)
            print("recv:", data)
            conn.send(data)
            if not data:
                conn.shutdown(socket.SHUT_WR)

    except Exception as  ex:
        print(ex)
    finally:
        conn.close()


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    server(9999)