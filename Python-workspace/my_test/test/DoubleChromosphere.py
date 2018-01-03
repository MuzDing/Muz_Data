# -*- coding:utf-8 -*-
__author__ = 'Muz'
__date__ = '17-12-27 上午11:50'


import random


def getNum(low, high):
    return random.randint(low,high)


def getDoubleChromosphere(m_list):
    while len(m_list)<6:
        temp = getNum(1,33)
        if temp not in m_list:
            m_list.append(temp)
    else:
        m_list.append(getNum(1,16))

if __name__ == "__main__":
    m_list = []
    getDoubleChromosphere(m_list)
    print(m_list)