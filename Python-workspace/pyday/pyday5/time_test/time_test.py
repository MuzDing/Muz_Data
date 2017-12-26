import time

print(time.time()/3600/24/365 +1970)
print(type(time.localtime()),time.localtime())

x=time.localtime()
print(x)
print(time.localtime().tm_year)

print("这是1973年第%s天"%time.localtime(123123123).tm_yday)

print(time.mktime(x))  #转化为时间戳

count = 0
while False:
    if count==200:
        break
    else:
        time.sleep(1)
        count+=1
    print(time.strftime("%Y-%m-%d %H-%M-%S",time.localtime()))


print(time.strptime('2016-1-1 11-2-2',"%Y-%m-%d %H-%M-%S"))
print(time.strptime('2016-2-3 11-6-7',"%Y-%m-%d %H-%M-%S").tm_mday)


print(time.asctime())

import datetime

print(datetime.datetime.now())

print(datetime.datetime.now()+datetime.timedelta(-3))
print(datetime.datetime.now()+datetime.timedelta(3))
print(datetime.datetime.now()+datetime.timedelta(hours=3))
print(datetime.datetime.now()+datetime.timedelta())
