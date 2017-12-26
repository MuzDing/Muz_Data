class A():
    count = 0
    def __init__(self):
        A.count+=1
    def exclain(self):
        print("i am an A")
    @classmethod
    def kids(cls):
        print("a has",cls.count,"little objects")

easy_a = A()
breezy_a = A()
wheezy_a =A()
A.kids()
A.exclain(easy_a)


class CoyoteWeapon:
    @staticmethod
    def commercial():
        print("this coyoteweapon has been brought to you ba acme")

CoyoteWeapon.commercial()