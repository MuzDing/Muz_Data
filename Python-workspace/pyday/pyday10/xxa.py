# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-2 上午10:54'
from greenlet import greenlet


def test1():
    print(12)
    gr2.switch()
    print(34)
    gr2.switch()


def test2():
    print(56)
    gr1.switch()
    print(78)



class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    gr1 = greenlet(test1)
    gr2 = greenlet(test2)
    gr1.switch()
