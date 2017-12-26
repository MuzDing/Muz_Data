class Person(object):
    def __init__(self,name):
        self.name = name

    def eat(self,food):
        print("%s is eatting %s....."%(self.name,food))
def bulk(self):
    print("%s is eatting....." % (self.name))
d=Person("Muz")
choise = input(">>:").strip()

if hasattr(d,choise):
    delattr(d,choise)
    # 动态添加一个方法
    # func = getattr(d, choise)
    # func("rice")
    # 动态添加属性
    # attr = getattr(d, choise)
    # print(attr)
    # setattr(d,choise,"axin")
else:
    # 动态添加一个方法
    # setattr(d,choise,bulk)
    #
    # #d.XXXX(d)
    #
    # func = getattr(d, choise)
    # func(d)

    # 动态添加一个属性
    setattr(d,choise,17)
    print(getattr(d,choise))
print(d.name)