class Element:
    def __init__(self,name,symbol,number):
        self._name = name
        self._symbol = symbol
        self._number = number
    #魔术方法
    def __str__(self):
        #print('name=',self.name,'symbol=',self.symbol,'number=',self.number)
        return('name %s,symbol %s,number %s' %(self.name,self.symbol,self.number))
    @property
    def name(self):
        return self._name
    @property
    def symbol(self):
        return self._symbol
    @property
    def number(self):
        return self._number

el_dict={'name':'Hydrogen','symbol':'H','number':'1'}
hydrogen = Element(**el_dict)

print(hydrogen.number)
print(hydrogen.name)
print(hydrogen.symbol)
