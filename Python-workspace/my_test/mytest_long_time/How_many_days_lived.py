from datetime import date
import time
import sys
fmt = "%Y-%m-%d"
def datetrans(tdate):
    spdate = tdate.replace("/","-")
    try:
        datesec=time.strptime(spdate,fmt)
    except ValueError:
        print("%s is not a rightful date!!!" % tdate)
        sys.exit(1)
    return time.mktime(datesec)
def daysdiff(d1,d2):
    return int((d1-d2)/(24*60*60))

party_day=input()

date1sec=datetrans(party_day)
date2sec=time.time()

print("you have survived for %s days" % daysdiff(date2sec,date1sec))
