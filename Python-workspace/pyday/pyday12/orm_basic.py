# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-1-5 上午10:41'

import sqlalchemy
from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy import Column, Integer, String
from sqlalchemy.orm import sessionmaker
from sqlalchemy import func             #分组

Base = declarative_base() #生成orm基类


def fun():
    engine = create_engine("mysql+pymysql://root:123456@localhost/test1?charset=utf8",
                           encoding='utf-8', echo=True)   # echo 打印过程
    Base.metadata.create_all(engine)  # 创建表结构


    #添加数据
    Session_class = sessionmaker(bind=engine)  # 创建与数据库的会话session class ,注意,这里返回给session的是个class,不是实例
    Session = Session_class()  # 生成session实例

    # user_obj = User(name="axin", password="123")  # 生成你要创建的数据对象
    # user_obj2 = User(name="muz", password="123")  # 生成你要创建的数据对象
    # # print(user_obj.name, user_obj.id)  # 此时还没创建对象呢，不信你打印一下id发现还是None
    #
    # Session.add(user_obj)  # 把要创建的数据对象添加到这个session里， 一会统一创建
    # Session.add(user_obj2)
    # # print(user_obj.name, user_obj.id)  # 此时也依然还没创建


    data = Session.query(User).filter(User.id>1).first()
    print(data.name)

    # data.name = "muz"
    # print(data.name,data.password)

    # row = Session.query(User).filter(User.name.like("m%")).count()  # 模糊查找
    # row = Session.query(User).filter(User.name.in_(['muz','axin'])).count()
    # print(row)

    # print(Session.query( User.name,func.count(User.name)).group_by(User.name).all())  #分组查询

    # print(Session.query(User,Sys_User).filter(User.id == Sys_User.usr_id).all())     #连表查询

    print(Session.query(User).join(Sys_User ,isouter=True).all())
    # Session.rollback()

    Session.commit()  # 现此才统一提交，创建数据


class User(Base):
    __tablename__ = 'user' #表名
    id = Column(Integer, primary_key=True)
    name = Column(String(32))
    password = Column(String(64))

    def __repr__(self):
        return '<id:%s, name:%s>' %(self.id,self.name)

class Sys_User(Base):
    __tablename__ = 'sys_user' #表名
    usr_id = Column(Integer, primary_key=True,nullable=False)
    usr_name = Column(String(50),nullable=False)
    usr_password = Column(String(50),nullable=False)
    usr_nickname = Column(String(50),nullable=False)
    usr_role  = Column(String(50),nullable=False)
    usr_status = Column(Integer)
    usr_num = Column(Integer)

    def __repr__(self):
        return '<id:%s, name:%s, role:%s>' %(self.usr_id,self.usr_name,self.usr_role)

class Main():
    def __init__(self):
        pass


if __name__ == '__main__':
    fun()