guess_me=7
if guess_me<7:
    print("too low")
elif guess_me>7:
    print ("too higt")
else :
    print ("just right")

from greenlet import greenlet

def func():
    pass


def test1():
    print(12)
    gr2.switch()
    print(34)
    gr2.switch()
def test2():
    print(56)
    gr1.switch()
    print(78)


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    gr1 = greenlet(test1)
    gr2 = greenlet(test2)
    gr1.switch()