class Duck():
    def __init__(self,input_name):
        self._name = input_name
    @property
    def name(self):
        print("inside the getter")
        return self._name
    @name.setter
    def name(self,input_name):
        print("inside the setter")
        self._name = input_name

fowl = Duck("Harwd")
print(fowl.name)

fowl.set_name="David"
print(fowl.name)

fowl._Duck__name