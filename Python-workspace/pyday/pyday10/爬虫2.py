# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-2 下午7:59'
from gevent import monkey;
import gevent
from  urllib.request import urlopen
import time


monkey.patch_all()

def func(url):
    print('GET: %s' % url)
    resp = urlopen(url)
    data = resp.read()
    print('%d bytes received from %s.' % (len(data), url))


class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    urls = ['https://www.python.org/',
            'https://www.yahoo.com/',
            'https://github.com/'
            ]
    time_start = time.time()
    for url in urls:
        func(url)
    print("同步cost",time.time() - time_start)

    async_time_start = time.time()
    gevent.joinall([
        gevent.spawn(func, 'https://www.python.org/'),
        gevent.spawn(func, 'https://www.yahoo.com/'),
        gevent.spawn(func, 'https://github.com/'),
    ])
    print("异步cost", time.time() - async_time_start)