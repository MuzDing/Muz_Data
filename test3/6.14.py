from collections import namedtuple
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
Duck = namedtuple('Duck')
tail = Tail("long")
bill = Bill('wide orange')
duck = Duck(bill,tail)
duck.about()