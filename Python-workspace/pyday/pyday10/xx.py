# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-2 上午10:12'


import multiprocessing
import time

def func(msg):
    print("msg:", msg)
    time.sleep(3)
    print("end")
    return "done" + msg

if __name__ == "__main__":
    pool = multiprocessing.Pool(processes=4)
    result = []
    for i in range(3):
        msg = "hello %d" %(i)
        result.append(pool.apply_async(func, (msg, )))
    pool.close()
    pool.join()
    for res in result:
        print( ":::", res.get())
    print ("Sub-process(es) done.")