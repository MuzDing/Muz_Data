package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.JDBC42CallableStatement;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.util.ConfigUtil;
import org.junit.Test;
public class TestUserList {
	@Test
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String username=ConfigUtil.getPropValue("jdbc.name");
		String password=ConfigUtil.getPropValue("jdbc.pwd");
		String url=ConfigUtil.getPropValue("jdbc.url");
		String driver=ConfigUtil.getPropValue("jdbc.driver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,username,password);
			st = con.createStatement();
			String sql="select * from class";
			rs = st.executeQuery(sql);  		//查询
		//	st.executeLargeUpdate("");					//增 删 改
			while(rs.next())
			{
				System.out.println(rs.getInt("num"));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
	public void f()
	{
		
	}
}
