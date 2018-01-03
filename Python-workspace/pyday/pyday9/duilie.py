# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-28 上午10:29'


import queue

q = queue.PriorityQueue()
q.put((1,"111"))
q.put((10,"222"))
q.put((19,"333"))
q.put((-1,"444"))

for i in range(4):
    print(q.get())

q = queue.LifoQueue()
q.put(1)
q.put(2)
q.put(3)

for i in range(3):
    print(q.get())

