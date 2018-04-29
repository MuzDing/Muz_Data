# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-4 下午2:23'
import  redis

def func():
    pass


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    # r = redis.Redis(host='localhost', port=6379)
    # print(r.get('name'))
    #连接库
    pool = redis.ConnectionPool(host='localhost',port=6379)

    r = redis.Redis(connection_pool=pool)
    print(r.get('age'))

