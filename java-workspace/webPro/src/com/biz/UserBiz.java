package com.biz;

import java.util.List;

import webPro.SysUser;

public interface UserBiz {
	/**
	 * 登录
	 * 返回值：SysUser
	 * 请求参数：String userName,String password
	 */
	public SysUser login(String userName,String password) throws ClassNotFoundException ;
	
	/**
	 * 查询所有用户
	 * 返回值：List<SysUser>
	 * 请求参数:无
	 */
	public List<SysUser> queryUserList();
	
	public List<SysUser> queryUserList(int startIndex,int size);

	public int queryUserCount(); 
	
	public List<SysUser> queryUserList(int stasrtIndex, int size, String userName, String userRole);
}
