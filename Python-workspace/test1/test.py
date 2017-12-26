str = raw_input()
m=list(str)

moon = 1
for i in m:
    if i == len(m):
        break
    if cmp(m[i],m[i+1]):
        moon+=1
print (float(len(str))/moon)
print (len(str),moon)
