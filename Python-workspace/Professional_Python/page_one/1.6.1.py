registry=[]
def register(decorated):
    registry.append(decorated)
    return decorated
@register
def foo():
    return 3
@register
def bar():
    return 6

answers = []
for func in registry:
    answers.append(func())
print(answers)

class Registry(object):
    def __init__(self):
        self._functions = []
    def register(self,decorated):
        self._functions.append(decorated)
    def run_all(self, *args, **kwargs):
        return_values = []
        for func in self._functions:
            return_values.append(func(*args,**kwargs))
        return return_values

a = Registry()
b = Registry()

@a.register
def fooo(x=3):
    return x

@b.register
def barr(x=6):
    return x

@a.register
@b.register
def bazz(x=7):
    return x

print(a.run_all())
print(b.run_all())
print(b.run_all())