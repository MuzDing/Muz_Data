# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-29 下午3:57'

from multiprocessing import Pipe,Process


def func(conn):
    conn.send([1,2,3])
    print(conn.recv())
    conn.close()

class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    parent_conn,child_conn=Pipe()
    p = Process(target=func,args=(child_conn,))
    p.start()
    print(parent_conn.recv())
    parent_conn.send("parent one")

