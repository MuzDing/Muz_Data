guess_me = 7
start =1
while True:
    if start<guess_me:
        print ("too low")
    elif start==guess_me:
        print ("found it!")
        break
    else:
        print ("opp")
        break
    start+=1