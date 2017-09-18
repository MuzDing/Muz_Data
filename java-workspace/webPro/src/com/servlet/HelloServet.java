package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
		name="xxservlet",urlPatterns={"/xx"},
		initParams = {@WebInitParam(name = "username",value="qst")},
		loadOnStartup = 0, asyncSupported = true,
		displayName ="xxservlet",description="Servlet阳历"
		)

public class HelloServet implements Servlet {

	/** servlet生命周期
	 * 1.加载HelloServlet，并实例化
	 * 2.运行初始化方法init()
	 * 3.运行请求service
	 * 4.销毁destroy
	 */
	static{
		System.out.println("beishilihua");
	}
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		System.out.println("destroy-----------------------");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根
		System.out.println("init-------------------");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		System.out.println("service-------------------");
	}

}
