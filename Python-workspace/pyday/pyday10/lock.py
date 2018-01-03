# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-29 下午4:22'
from multiprocessing import Lock , Process


def func(l,i):
    l.acquire()
    try:
        print('hello world', i)
    finally:
        l.release()


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    l = Lock()

    for i in range(10):
        Process(target=func,args=(l,i,)).start()