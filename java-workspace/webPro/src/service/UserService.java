package service;

import webPro.SysUser;

public interface UserService {
	/**登录
	 * 返回值 SysUser
	 * 请求参数：String userName,String password
	 */
	public SysUser login(String userName, String password) throws ClassNotFoundException;



}
