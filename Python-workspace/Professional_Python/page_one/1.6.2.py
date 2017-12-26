import functools
def requires_ints(decorated):
    @functools.wraps(decorated)
    def inner( *args, **kwargs):
        kwarg_values = [i for i in kwargs.values()]
        for arg in list(args)+kwarg_values:
            if not isinstance(arg,int):
                raise TypeError('%s only accpets integers as arguments.'%decorated.__name__)
        return decorated(*args,**kwargs)
    return inner

@requires_ints
def foo(x,y):
    """return the sum of x and y"""
    return x+y

print(help(foo))
print(foo(3,7))

class User(object):
    """A representation of a user in our application"""

    def __init__(self,username,email):
        self.username = username
        self.email = email
class AnonymousUser(User):
    """An anonymous user; a stand-in for an actual user that nonetheless
    is not an actual user."""

    def __init__(self):
        self.username=None
        self.email = None
    def __nonzero__(self):
        return False

def requires_user(func):
    @functools.wraps(func)
    def inner(user,*args,**kwargs):
        if user and isinstance(user,User):
            return func(user,*args,**kwargs)
        else:
            raise ValueError('a vaild user is required to run this.')
    return inner

name = "lll"
email = "163"
a = User(name,email)
b = AnonymousUser()
@requires_user
def login(b):
    print("s")

