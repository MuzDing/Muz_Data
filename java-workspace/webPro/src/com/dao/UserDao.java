package com.dao;

import java.sql.SQLException;
import java.util.List;

import webPro.SysUser;

public interface UserDao {
	
	public SysUser login(String userName,String password) throws ClassNotFoundException ;
	public boolean register(String userName, String password) throws ClassNotFoundException;
	
	public List<SysUser> queryUserList();
	public List<SysUser> queryUserList(int startIndex, int size);
	public int queryUserCount();
	
	public List<SysUser> queryUserList(int stasrtIndex,int size,
			String userName,String userRole);
}
