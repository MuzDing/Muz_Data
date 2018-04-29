# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-4 下午4:49'

from pyday11.RedisHelper import RedisHelper


def func():
    while True:
        obj = RedisHelper()
        obj.public(input(">>>"))


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    func()