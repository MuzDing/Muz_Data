import calendar
print(calendar.isleap(2100))

from datetime import date

halloween = date(2014,10,31)
print(halloween)

print(halloween.day)

print(halloween.isoformat())

from datetime import timedelta
from datetime import date
now = date.today()
print(now)
one_day = timedelta(days=1)
tomorrow = now+one_day
print(tomorrow)

print(now+17*one_day)

print(now -one_day)


from datetime import time
noon = time(12,0,0)
print(noon)

print(noon.hour,noon.second,noon.microsecond)

from datetime import datetime

some_day = datetime(2014,1,2,3,4,5,6)
print(some_day)
print(some_day.isoformat())


now = datetime.now()
print(now)


noon = time(12)
this_day=date.today()
noon_today = datetime.combine(this_day,noon)
print(noon_today)

print(noon_today.date())
print(noon_today.time())

#open('10.4.2.py','wt')