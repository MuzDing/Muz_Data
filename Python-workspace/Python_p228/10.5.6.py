import multiprocessing

def now(second):
    from datetime import datetime
    from time import sleep
    sleep(second)
    print('wait',seconds,'seconds ,time is ', datetime.utcnow())

if __name__=="__main__":
    import random
    for n in range(3):
        seconds = random.random()
        print(seconds)
        pro = multiprocessing.Process(target=now,args=(seconds,))
        pro.start()
