package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.SecretKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.UserBiz;
import com.biz.UserBizImpl;
import com.dao.UserDao;
import com.dao.UserDaoImpl;

import service.UserService;
import service.UserServiceImpl;
import webPro.SysUser;
import webPro.User;

public class UserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881008327508621713L;
	UserBiz ub = new UserBizImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		HttpSession session = req.getSession();
		ServletContext application = req.getServletContext();
		String action = req.getParameter("action");
		
		if("unlogin".equals(action)){
			session.removeAttribute("userLogin");
			int userCount = 0;
			
			Object object = application .getAttribute("userCount");
			if(object != null){
				userCount = Integer.valueOf(object.toString());
			}
			userCount--;
			application.setAttribute("userCount", userCount);
			
			resp.sendRedirect("index.jsp");
		}
		if("login".equals(action)){
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			int type=1;		
		//	session.setMaxInactiveInterval(10);
			UserService ud = new UserServiceImpl();
			SysUser u=null;
			try {
				u = ud.login(username, password);
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if(u!=null){
				type=1;
				session.setAttribute("userLogin", u);
		  		Cookie ck = new Cookie("usernamecookie",username);
		  		ck.setMaxAge(5);
		  		Cookie ck2 = new Cookie("passwordcookie",password);
		  		ck2.setMaxAge(5);
		    	resp.addCookie(ck);
		    	resp.addCookie(ck2);
		    	
				resp.sendRedirect("index.jsp");	
			}
			else
			{
				type = -1;
				resp.sendRedirect("login.jsp?type="+type);
			}
		}
		if("queryUserList".equals(action)){
			queryUserList(req, resp);
		}
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doGet(req, resp);
	}
	public void queryUserList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String pi = req.getParameter("pageIndex");
		int pageIndex = Integer.valueOf(pi);
		int pageSize=3;
		int startIndex = pageSize *(pageIndex - 1);
		
		int uc = ub.queryUserCount();
		int pageTotal = 0;
		if(uc%pageSize ==0){
			//判断总记录数和每页显示的数量相除有没有余数，如果有余数则总页数：总计路数/每页显示的数量
			pageTotal=uc/pageSize;
		}else{
			//如果有余数则总页数：总计路数/每页显示的数量+1
			pageTotal = uc/pageSize+1;
		}
		
		String userName = req.getParameter("userName");
	//	String userRole = req.getParameter("userRole");
		List<SysUser> uls = ub.queryUserList(startIndex,pageSize);
		req.setAttribute("userList", uls);
		req.setAttribute("pageIndex", pageIndex);
		req.setAttribute("pageTotal", pageTotal);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	

}
