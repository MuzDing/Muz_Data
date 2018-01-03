# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-28 下午8:08'

import multiprocessing
import time
import threading

def thread_run(name):
    print(threading.get_ident())
def run(name):
    time.sleep(5)
    print(name)
    p = threading.Thread(target=thread_run,args=(name,))
    p.start()
if __name__=="__main__":
    for i in range(10):
        p = multiprocessing.Process(target=run,args=("name = %s" %i,))
        p.start()
        # p.join()


