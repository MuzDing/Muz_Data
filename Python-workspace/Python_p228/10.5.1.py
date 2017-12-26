from datetime import date
now = date.today()

now_str = now.isoformat()
print(now)

with open("today",'wt') as output:
    print(now_str,file=output)