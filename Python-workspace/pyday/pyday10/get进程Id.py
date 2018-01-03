# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-29 上午11:38'

# from multiprocessing import Process
import multiprocessing
import os


def info(title):
    print(title)
    print("module name:",__name__)
    print("parent process:",os.getppid())
    print("process id:", os.getpid())

def f(name):
    info("called from child process function")
    print("hellp %s" %name)
if __name__ == "__main__":
    info("main process line")
    p = multiprocessing.Process(target=f,args=('bob',))
    p.start()