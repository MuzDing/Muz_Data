class Person(object):
    def __init__(self,name):
        self.name = name

    def eat(self,food):
        print("%s is eatting %s....."%(self.name,food))
def bulk(self):
    print("%s is eatting....." % (self.name))
d=Person("Muz")
# choise = input(">>:").strip()

# getattr(d,choise)("axin")


names=['axin','Muz']

data={}


try:
    names[2]
    data['name']

except (KeyError,IndexError) as e:
    print("没有这个KEY",e)
except IndexError as e:
    print("没有这个元素",e)