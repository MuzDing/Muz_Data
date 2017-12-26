from datetime import timedelta
from datetime import date
mu_day = date(1997,6,11)
print(mu_day.weekday())
print(mu_day.isoweekday())


patry_day=mu_day +timedelta(days=10000)

print(patry_day)
