import  multiprocessing
import os

def do_this(what):
    whoami(what)
def whoami(what):
    print("process %s say :%s" % (os.getpid(),what))

if __name__ == "__main__":
    whoami("i am the main program")
    for n in range(4):
        p = multiprocessing.Process(target=do_this,
            args=(" i'm fuction %s" %n,))
        p.start()


#open('10.3,3.py','wt')