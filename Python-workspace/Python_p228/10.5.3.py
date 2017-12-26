from datetime import datetime
fmt = '%Y-%m-%d\n'

with open('today','rt') as input:
    today_string = input.read()
print(datetime.strptime(today_string,fmt))