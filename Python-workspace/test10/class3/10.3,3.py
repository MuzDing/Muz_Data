import os
import multiprocessing
import time
def whoami(name):
    print("i'm %s, in proess %s" %(name,os.getpid()))
def loopy(name):
    whoami(name)
    start =1
    stop = 1000000
    for num in range(start,stop):
        print("\tNumber %s of %s.Honk!" %(num,stop))
        time.sleep(0.1)
if __name__=="__main__":
    whoami("main")
    p=multiprocessing.Process(target=loopy,args=("looy",))
    p.start()
    time.sleep(5)
    p.terminate()