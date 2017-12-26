class Person():
    def __init__(self,name):
        self.name = name

class EmailPerson(Person):
    def __init__(self,name,email):
        super().__init__(name)
        self.email=email

person=EmailPerson('Ronnie','ld56888@163.com')

print(person.name)
print(person.email)