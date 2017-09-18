package service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

import webPro.SysUser;

public class UserServiceImpl implements UserService {

	UserDao ud = new UserDaoImpl();
	public SysUser login(String userName, String password) throws ClassNotFoundException {
		// TODO 自动生成的方法存根
		return ud.login(userName, password);
	}

}
