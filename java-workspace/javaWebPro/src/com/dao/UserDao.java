package com.dao;

import java.util.List;

import com.entity.SysUser;

public interface UserDao {

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
	
	/**
	 * 分页查询所有用户
	 * 返回值：List<SysUser>
	 * 请求参数:无
	 */
	public List<SysUser> queryUserList(int startIndex,int size);
	
	/**
	 * 分页查询所有用户(按条件查询)
	 * 返回值：List<SysUser>
	 * 请求参数:无
	 */
	public List<SysUser> queryUserList(int startIndex,int size,String userName,String userRole);
	
	/**
	 * 查询用户表记录数
	 * @return
	 */
	public int queryUserCount();
	
	/**
	 * 按条件查询后用户表记录数
	 * @return
	 */
	public int queryUserCount(String userName,String userRole);
	
	/**
	 * 修改用户头像
	 */
	public boolean updateUserImg(String userName,String imgUrl);
}
