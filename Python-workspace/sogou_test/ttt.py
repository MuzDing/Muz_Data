str = raw_input()
m=list(str)

moon = 1
i=0
while True:
    if i < len(m)-1:
        if m[i] != m[i + 1]:
            moon += 1
    else:
        break
    i+=1
print (float(len(str))/moon)