package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;

import com.util.ConfigUtil;

import webPro.SysUser;

public class BaseDao {
	private Connection conn = null;
	private PreparedStatement psmt =null;
	protected ResultSet rs=null;
	
	private void getConnection() throws ClassNotFoundException, SQLException
	{
		String driver = ConfigUtil.getPropValue("jdbc.driver");
		String url = ConfigUtil.getPropValue("jdbc.url");
		String jdbcuser = ConfigUtil.getPropValue("jdbc.name");
		String pwd = ConfigUtil.getPropValue("jdbc.pwd");
		
		//加载驱动
		Class.forName(driver);
		//获取连接
		conn = DriverManager.getConnection(url, jdbcuser, pwd);
		
	}
	protected ResultSet execQuery(String readsql,Object[] paras) throws ClassNotFoundException, SQLException
	{
		this.getConnection();
		psmt = conn.prepareStatement(readsql);
		
		if(paras !=null)
		{
			for(int i = 0;i<paras.length ;i++)
			{
				psmt.setObject(i+1, paras[i]);
			}
		}
		rs = psmt.executeQuery();
		return rs;
	}
	protected boolean execUpdate(String writesql,Object[] paras) throws ClassNotFoundException, SQLException
	{
		this.getConnection();
		boolean updateRs = false;
		//创建预编译语句
		psmt = conn.prepareStatement(writesql);
		
		if(paras !=null)
		{	//设置参数
			for(int i = 0;i<paras.length ;i++)
			{
				psmt.setObject(i+1, paras[i]);
			}
		}
		//受影响行数
		int num = psmt.executeUpdate();
		if(num>0){
			updateRs = true;
		}
		return updateRs;
		
	}
	protected void closeResource() throws SQLException
	{
		if(rs!=null)
		{
			rs.close();
		}
		if(psmt!=null)
		{
			psmt.close();
		}
		if(conn!=null)
		{
			conn.close();
		}
	}

}
