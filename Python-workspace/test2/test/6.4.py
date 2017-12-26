class Car():
    def exclaim(self):
        print ("i am a car")
class Yugo(Car):
    def exclaim(self):
        print ("i am a Yugo! Much like a Car ,but more Yugo-ish")
give_me_a_car =Car()
give_me_a_yugo =Yugo()

give_me_a_car.exclaim()
give_me_a_yugo.exclaim()


class Person():
    def __init__(self,name):
        self.name = name
class MDPerson():
    def __init__(self,name):
        self.name ="Doctor "+ name
class JDPerson():
    def __init__(self,name):
        self.name ="Esquire "+ name

person = Person('fudd')
doctor = MDPerson('fudd')
lawyer = JDPerson('fudd')
print (person.name,doctor.name,lawyer.name)