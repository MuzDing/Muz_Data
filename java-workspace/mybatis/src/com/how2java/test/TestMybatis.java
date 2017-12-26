package com.how2java.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.how2java.pojo.Category;

public class TestMybatis {
	public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
    
        //查询（ID）
        //Category c= session.selectOne("getCategory",3);
        //System.out.println(c.getName());
        
        //删除语句(ID)
        //Category c = new Category();
        //c.setId(6);
        //session.delete("deleteCategory",c);
        //listAll(session);
        
        //新增一组数据
        //Category c = new Category();
        //c.setName("新增加的Category");
        //session.insert("addCategory",c);
        //listAll(session);
        
        //修改
        //Category c= session.selectOne("getCategory",3);
        //c.setName("修改了的Category名稱");
        //session.update("updateCategory",c);
        //listAll(session);
        
        //查询所有
        listAll(session);
        session.commit();
        session.close();
        
 
    }
    private static void listAll(SqlSession session) {
        List<Category> cs = session.selectList("listCategory");
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }
}
