class Element:
    def __init__(self,name,symbol,number):
        self.name = name
        self.symbol = symbol
        self.number = number
    def dump(self):
        #print('name=',self.name,'symbol=',self.symbol,'number=',self.number)
        print('name %s,symbol %s,number %s' %(self.name,self.symbol,self.number))
el_dict={'name':'Hydrogen','symbol':'H','number':'1'}
hydrogen = Element(**el_dict)
hydrogen.dump()