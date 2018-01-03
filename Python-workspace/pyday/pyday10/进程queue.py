# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-29 下午3:24'

from multiprocessing import Process,Queue
import threading


def f(qq):
    print("in child:", qq.qsize())
    qq.put([42, None, 'hello'])
    print("in child:", qq.qsize())
def func():
    pass


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    q = Queue()
    p = Process(target=f, args=(q,))
    # p = threading.Thread(target=f,)
    p.start()
    print(q.get())