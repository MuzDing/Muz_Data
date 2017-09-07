from collections import namedtuple
Duck = namedtuple('Duck','bill tail')
class Bill():
    def __init__(self,description):
        self.description = description
class Tail():
    def __init__(self,lenght):
        self.lenght = lenght
class Duck():
    def __init__(self,bill,tail):
        self.bill=bill
        self.tail=tail
    def about(self):
        print('this duck has a',bill.description,'bill and a',tail.lenght,'tail')

duck = Duck('wide orange','long')
print(duck)
print(duck.bill)
print(duck.tail)

parts = {'bill':'wide orange','tail':'long'}
duck2=Duck(**parts)
print(duck2)

duck3 = duck2._replace(tail ='agnificent' , bill ='crushing')
print(duck3)