class Duck():
    def __init__(self,input_name):
        self.hidden_name = input_name
    def get_name(self):
        print("inside the getter")
        return self.hidden_name
    def set_name(self,input_name):
        print("inside the setter")
        self.hidden_name = input_name
    name = property(get_name,set_name)

fowl = Duck("Harwd")
print(fowl.name)

fowl.set_name("Daffy")
print(fowl.name)

class Duck1():
    def __init__(self,input_name):
        self.hidden_name = input_name
    @property
    def name(self):
        print("111111111111111")
        return self.hidden_name
    @name.setter
    def name(self,input_name):
        print("222222222222")
        self.hidden_name=input_name

fowl = Duck1("Harwd")
print(fowl.name)

fowl.name="David"
print(fowl.name)


class Circle():
    def __init__(self,radius):
        self.radius = radius
    @property
    def diameter(self):
        return 2*self.radius

c=Circle(5)
print(c.radius)
print(c.diameter)

c.radius =7
print(c.diameter)