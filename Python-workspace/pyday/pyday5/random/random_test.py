import random

print(random.random())

print(random.randint(1,10))  #包括10

print(random.randrange(1,10))  #不包括10

print(random.choice([1,8,10])) #列表中选一个

print(random.sample("hellp",2))  #随机取2位

print(random.uniform(1,10))   #浮点数


items=[1,2,3,4,5,6,7,8]
print(items)

random.shuffle(items)
print(items)
