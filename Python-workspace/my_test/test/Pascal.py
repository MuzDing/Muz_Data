# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-27 下午6:02'

def triangles():
    L = [1]
    while True:
        yield L
        L.append(0)
        L = [L[i - 1] + L[i] for i in range(len(L))]
if __name__=="__main__":
    a=triangles()
    a1=1
    for i in a:
        if a1 == 9:
            break
        else:
            print(i)
            a1+=1