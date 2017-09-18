package com.dao;
import com.code.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import webPro.SysUser;

import com.util.ConfigUtil;

public class UserDaoImpl extends BaseDao implements UserDao {
		
	//@Override
	public SysUser login(String userName, String password) throws ClassNotFoundException {
		SysUser user = null;

		String sql = "SELECT * FROM class WHERE "
				+ "num = ?"
				+ "and name = ?";		
		try {
			
			encrypt jiem= new encrypt();
			userName = jiem.jiam(userName);
			password = jiem.jiam(password);
			Object [] objs = {userName,password};
			
			super.rs = super.execQuery(sql, objs);
			if(rs.next()){
				user = new SysUser();
				user.setUsrNickname(rs.getString("num"));
				user.setUsrPassword(rs.getString("name"));
				//user.setUsrName(rs.getString("usr_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//释放资源
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return user;
	}
	public boolean register(String userName, String password) throws ClassNotFoundException {
		SysUser user = null;
		boolean bo=false;
		String sql = "insert into class values(?,?,?)";	
		encrypt enc = new encrypt();
		userName = enc.jiam(userName);
		password = enc.jiam(password);
		try {
			
			Object [] objs = {userName,password,1};
			
			bo = super.execUpdate(sql, objs);
			/*if(rs.next()){
				user = new SysUser();
				user.setUsrNickname(rs.getString("num"));
				user.setUsrPassword(rs.getString("name"));
				//user.setUsrName(rs.getString("usr_name"));
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//释放资源
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return bo;
	}
	@Override
	public List<SysUser> queryUserList(){
		// TODO 自动生成的方法存根
		List<SysUser> uls = new ArrayList<SysUser>();
		String sql = "SELECT * FROM class";
		try {
			super.rs = super.execQuery(sql, null);
			while(super.rs.next()){
				SysUser u = new SysUser();
				u.setUsrNickname(rs.getString("num"));
				u.setUsrPassword(rs.getString("name"));
				uls.add(u);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return uls;
	}
	@Override
	public List<SysUser> queryUserList(int startIndex, int size) {
		List<SysUser> uls = new ArrayList<SysUser>();
		String sql = "SELECT * FROM class LIMIT ?,?";
		Object [] objs = {startIndex,size};
		deciphering dec = new deciphering();
		try {
			super.rs = super.execQuery(sql, objs);
			while(super.rs.next()){
				SysUser u = new SysUser();
				u.setUsrName(dec.jiem(rs.getString("num")));
				u.setUsrPassword(dec.jiem(rs.getString("name")));
				uls.add(u);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return uls;
	}
	@Override
	public int queryUserCount() {
		int count = 0;
		String sql = "SELECT count(1) count FROM class";
		try {
			super.rs = super.execQuery(sql, null);
			while(super.rs.next()){
				count = rs.getInt("count");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return count;
	}
	public List<SysUser> queryUserList(int stasrtIndex, int size, String userName, String userRole) {
		// TODO 自动生成的方法存根
		List<SysUser> uls = new ArrayList<SysUser>();
		
		Object [] objs = new Object[2];
		objs[0]=stasrtIndex;
		objs[1]=size;
		StringBuffer sb = new StringBuffer("select * from class where 1=1");
		if(userName !=null && userName !=""){
			sb.append(" and name like '"+userName+"%'");
		}
		if(userRole!= null && userRole !=""){
			sb.append(" and role =?");
			Object [] objs2 = new Object[3];
			objs[0]=userRole;
			objs[1]=stasrtIndex;
			objs[2]=size;
			
		}
		sb.append("limit ?,?");
		String sql = "SELECT * FROM class LIMIT ?,?";
	//	Object [] objs = {startIndex,size,uerRole};
		deciphering dec = new deciphering();
		try {
			super.rs = super.execQuery(sql, objs);
			while(super.rs.next()){
				SysUser u = new SysUser();
				u.setUsrName(dec.jiem(rs.getString("num")));
				u.setUsrPassword(dec.jiem(rs.getString("name")));
				uls.add(u);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				super.closeResource();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return uls;
	}
}
