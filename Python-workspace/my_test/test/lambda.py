# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '17-12-27 上午10:59'


import sys
def f():
    a = [1, 2, 3]
    f = lambda x: x + 1
    print(list(map(f, a)))

if __name__ == "__main__":
    pairs = [(1, 'one'), (2, 'two'), (3, 'three'), (4, 'four')]
    pairs.sort(key=lambda pair: pair[1])
    f1 = lambda pair: pair[1]
    print(list(map(f1,pairs)))
    print(pairs)
    # f()

