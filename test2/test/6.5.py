class Car():
    def exclaim(self):
        print ("i am a car")
class Yugo(Car):
    def exclaim(self):
        print ("i am a Yugo! Much like a Car ,but more Yugo-ish")
    def need_a_push(self):
        print ("a litter help here")
give_me_a_car =Car()
give_me_a_yugo =Yugo()

give_me_a_yugo.need_a_push()
