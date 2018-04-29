# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-4 下午4:25'

import redis

def func():
    pool = redis.ConnectionPool(host='127.0.0.1', port=6379)

    r = redis.Redis(connection_pool=pool)

    # pipe = r.pipeline(transaction=False)
    pipe = r.pipeline(transaction=True)

    pipe.set('name1', 'alex')
    pipe.set('role1', 'sb')

    pipe.execute()


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    func()
