import time
def consumer(name):
    print("准备吃包子了%s"%name)
    while True:
        baozi = yield
        print("包子%s被%s吃掉了"%(baozi,name))
def producter(name):
    c=consumer('a')
    c2=consumer('b')
    c.__next__()
    c2.__next__()
    print("开始做包子")
    for i in range(10):
        time.sleep(1)
        print('生成了2个包子')
        c.send(i)
        c2.send(i)

# c=consumer("muz")
# c.__next__()
# c.send("韭菜")
producter('muz')


