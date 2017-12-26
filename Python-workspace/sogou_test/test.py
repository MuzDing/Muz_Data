a=int(raw_input())
the_list=[]
for i in range(a):
    the_list.append(float(raw_input()))

temp=True
the_long=0
the_long_temp =0

for i in range(a):
    for j in range(a):
        if the_list[j]- the_list[i] >=180:
            the_long_temp=360-the_list[j]+the_list[i]
            if(the_long_temp>=the_long):
                the_long=the_long_temp
            print (the_long)
        else:
            the_long_temp =the_list[j]-the_list[i]
            if (the_long_temp >= the_long):
                the_long = the_long_temp
            print (the_long)

print (the_long)