# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-28 上午10:35'

import  queue
import time
import threading
q = queue.Queue()

def Producer(name):
    count = 1
    while True:
        q.put("包子:%s" %count)
        print("生产了包子",count)
        time.sleep(0.5)
        count+=1
def Consumer(name):
    while True:
        print("%s吃掉了%s" %(name,q.get()))
        time.sleep(1)

p = threading.Thread(target=Producer,args=("axin",))
c1 = threading.Thread(target=Consumer,args=("muz",))
c2 = threading.Thread(target=Consumer,args=("miao",))

p.start()
c1.start()
c2.start()
