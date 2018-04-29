# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-4 下午4:42'

from pyday11.RedisHelper import RedisHelper

obj = RedisHelper()
redis_sub = obj.subscribe()

while True:
    msg = redis_sub.parse_response()
    print(msg)