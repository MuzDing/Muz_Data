class Element:
    def __init__(self,name,symbol,number):
        self.name = name
        self.symbol = symbol
        self.number = number

hybrogen =Element('Hydrogen','H','1')
print(hybrogen.number,hybrogen.symbol,hybrogen.name)