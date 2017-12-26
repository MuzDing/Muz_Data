def get_odd():
    for number in range(1,10,2):
        yield number
for count,number in enumerate(get_odd(),1):
    if count ==3:
        print (number)