# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-5 上午10:31'
from sqlalchemy import create_engine

def func():
    engine = create_engine("mysql+pymysql://root:123456@127.0.0.1:3306/test1?charset=utf8", max_overflow=5)
    # 执行SQL
    # cur = engine.execute(
    #     "INSERT INTO hosts (host, color_id) VALUES ('1.1.1.22', 3)"s
    # )

    # 新插入行自增ID
    # cur.lastrowid

    # 执行SQL
    # cur = engine.execute(
    #     "INSERT INTO hosts (host, color_id) VALUES(%s, %s)",[('1.1.1.22', 3),('1.1.1.221', 3),]
    # )


    # 执行SQL
    # cur = engine.execute(
    #     "INSERT INTO hosts (host, color_id) VALUES (%(host)s, %(color_id)s)",
    #     host='1.1.1.99', color_id=3
    # )

    # 执行SQL
    cur = engine.execute('select * from sys_user')
    # 获取第一行数据
    cur.fetchone()
    # 获取第n行数据
    cur.fetchmany(3)
    # 获取所有数据
    print(cur.fetchall())

class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    func()


