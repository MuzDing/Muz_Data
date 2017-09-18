package com.biz;

import java.sql.SQLException;
import java.util.List;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import webPro.SysUser;

public class UserBizImpl implements UserBiz {
	UserDao ud = new UserDaoImpl();
	
	@Override
	public SysUser login(String userName, String password)
			throws ClassNotFoundException {
		return ud.login(userName, password);
	}

	@Override
	public List<SysUser> queryUserList() {
		return ud.queryUserList();
	}

	@Override
	public List<SysUser> queryUserList(int startIndex, int size) {
		// TODO 自动生成的方法存根
		return ud.queryUserList(startIndex,size);
	}

	@Override
	public int queryUserCount() {
		// TODO 自动生成的方法存根
		return ud.queryUserCount();
	}

	@Override
	public List<SysUser> queryUserList(int stasrtIndex, int size, String userName, String userRole) {
		// TODO 自动生成的方法存根
		return ud.queryUserList(stasrtIndex, size, userName, userRole);
	}
	

	

}
