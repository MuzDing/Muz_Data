def decorated_by(func):
    func.__doc__+='\nDecorated by decorated_by.'
    return func
@decorated_by
def add(x,y):
    """return two number add"""
    return x+y

#add = decorated_by(add)  #方法一
print(add.__doc__)