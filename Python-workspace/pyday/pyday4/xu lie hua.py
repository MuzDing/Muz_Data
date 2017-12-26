import json
import pickle
info={
    'name':'muz',
    'age':22
}

f=open("test.txt",'r')
# data = json.loads(f.read())
# f.write(pickle.dumps(info))   #wb
# f.write(json.dumps(info))     #w

f.close()
# print(data['age'])

