package com.czu;

public class UserManagerBean {
	public boolean Usercheck(UserBean ub){
		String id;
		String pwd;
		id=ub.getUserId();
		pwd=ub.getUserPWD();
		if("001".equals(id) &&"123".equals(pwd))
			return true;
		else 
			return false;
		
	}

}
