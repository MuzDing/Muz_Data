import re
source = "young Frankenstein"
m=re.match('you',source)
if m:
    print(m.group())

m=re.match('you',source)
if m:
    print(m.group())

m=re.search('Frank',source)
if m:
    print(m.group())
m=re.match('.*Frank',source)
if m:
    print(m.group())

m=re.findall('n',source)
print(m)

m=re.findall('n.?',source)
print(m)

m=re.split(' ',source)
print(m)

m=re.sub("n",'?',source)
print(m)


import string
printable = string.printable
len(printable)

print(printable[0:50])
print(printable[50:])

m=re.findall('\d',printable)
print(m)

m=re.findall('\s',printable)
print(m)


source =''' i wish i may,i wish i might 
        ... Have q dish of fish tonight'''

print(re.findall('wish',source))

print(re.findall('wish|fish',source))

print(re.findall('^wish',source))

print(re.findall('^ i wish',source))

print(re.findall('fish$',source))