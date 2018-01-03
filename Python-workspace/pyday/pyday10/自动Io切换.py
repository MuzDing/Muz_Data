# -*- coding:utf-8 -*-

__author__ = 'Muz'
__date__ = '18-1-2 下午1:28'

import gevent

def foo():
    print('Running in foo')
    gevent.sleep(2)
    print('Explicit context switch to foo again')
def bar():
    print('Explicit精确的 context内容 to bar')
    gevent.sleep(1)
    print('Implicit context switch back to bar')
def func3():
    print("running func3 ")
    gevent.sleep(0)
    print("running func3  again ")

def func():
    pass


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    gevent.joinall([
        gevent.spawn(foo),  # 生成，
        gevent.spawn(bar),
        gevent.spawn(func3),
    ])