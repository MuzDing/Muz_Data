import functools
import logging
import time

def logged(method):
    """ Causer the decorated method to be run and its resuts logged.along
    with some other diagnostic information."""
    @functools.wraps(method)
    def inner(*args,**kwargs):
        start = time.time()

        return_value = method(*args,**kwargs)

        end = time.time()

        delta = end-start

        logger = logging.getLogger('decorator.logged')
        logger.warn('Called method %s at %0.2f; execution time %0.2f''seconds;reult %r.'
                    %(method.__name__,start,delta,return_value))
        return return_value
    return inner

@logged
def sleep_and_return(return_value):
    time.sleep(2)
    return return_value

print(sleep_and_return(42))