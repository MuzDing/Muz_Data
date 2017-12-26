import time
now = time.time()

print(now)
print(time.ctime(now))

print(time.strftime(time.ctime(now)))

fmt = "it's %A %B %d %y ,local time %I:%M:%S%p"
t=time.localtime()

print(t)

print(time.strftime(fmt,t))

from datetime import  date

some_day = date(2014,7,4)
fmt = "it's %A %B %d %y ,local time %I:%M:%S%p"

print(some_day.strftime(fmt))


import time
fmt = "%Y-%m-%d"
print(time.strptime("2012-2-2",fmt))