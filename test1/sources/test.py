from collections import Counter
breakfast = ['spam','egg','spam','spam']
breakfast_counter =Counter(breakfast)
print (breakfast_counter)

print (breakfast_counter.most_common())

print (breakfast_counter.most_common(1))

lunch = ['egg','egg','bacon']
lunch_counter = Counter(lunch)
print (lunch_counter)

print (breakfast_counter+lunch_counter)

print (breakfast_counter-lunch_counter)

print (lunch_counter-breakfast_counter)

print (lunch_counter &breakfast_counter)

print (breakfast_counter | lunch_counter)


#you xu zi dian
from collections import OrderedDict
quotes=OrderedDict([
    ('moe','a wise guy, huh?'),
    ('larry','ow!'),
    ('curly','nyuk,nyuk!'),
])

for stoge in quotes:
    print (stoge)

# shuang duan dui lie zhan+duilie

def palindrome(wrod):
    from collections import deque
    dq = deque(wrod)
    while len(dq)>1:
        if dq.popleft() != dq.pop():
            return False
    return True

print (palindrome('a'))

print (palindrome("racecar"))

print (palindrome(" "))

print (palindrome("abc"))

#yong qie pian fan zhuan zi fu chuan

def another_palidrome(word):
    return word == word[::-1]

print (palindrome('a'))

print (palindrome("racecar"))

print (palindrome(" "))

print (palindrome("abc"))

#shi yong itertools die dai  dai ma jie gou

import itertools

for item in itertools.chain([1,2],['a','b']):
    print (item)

#for item in itertools.cycle([1,2]):   // wu xian xun huan
 #   print (item)

#for item in itertools.accumulate([1,2,3,4]):   #jieguo 1 3 6 10
 #   print (item)

def multiply(a,b):
    return a*b

#for item in itertools.accumulate([1,2,3,4],multiply()): # xiang cheng
 #   print (item)


from pprint import pprint

quotes={"a":"1",
        "b":"2",
        "c":"3"}

from collections import OrderedDict
quotes1=OrderedDict([
    ('moe','a wise guy, huh?'),
    ('larry','ow!'),
    ('curly','nyuk,nyuk!'),
])
print (quotes)
pprint(quotes)
print (quotes1)
pprint(quotes1)