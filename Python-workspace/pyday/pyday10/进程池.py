# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-2 上午9:28'
import time
from  multiprocessing import Pool,freeze_support
import os

def func():
    pass

def Foo(i):
    time.sleep(2)
    print("in process",os.getpid())
    return i + 100

def Bar(arg):
    print('-->exec done:', arg,os.getpid())

class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    # freeze_support()
    pool = Pool(processes=5)  # 允许进程池同时放入5个进程
    print("主进程", os.getpid())
    for i in range(1):
        pool.apply_async(func=Foo, args=(i,), callback=Bar)  # callback=回调
        # pool.apply(func=Foo, args=(i,)) #串行
        # pool.apply_async(func=Foo, args=(i,)) #串行
    print('end')
    pool.close()
    pool.join()  # 进程池中进程执行完毕后再关闭，如果注释，那么程序直接关闭。.join()