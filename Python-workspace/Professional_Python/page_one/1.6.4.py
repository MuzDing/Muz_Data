import functools
import json

class JSONOutputError(Exception):
    def __init__(self,message):
        self.message = message
    def __str__(self):
        return self.message

def json_output(decorated):
    """return the json string"""
    @functools.wraps(decorated)
    def inner(*args,**kwargs):
        try:
            result = decorated(*args,**kwargs)
        except JSONOutputError as ex:
            result = {'status':'error',
                      'message':str(ex),
                      }
        return json.dumps(result)
    return inner
@json_output
def do_nothing():
    raise JSONOutputError("this function is erratic.")

@json_output
def other_error():
    raise ValueError("this is a error")
print(other_error())
print(do_nothing())