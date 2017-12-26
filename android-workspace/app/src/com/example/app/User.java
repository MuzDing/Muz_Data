package com.example.app;

public class User {
	private String num;
	private String password;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean Jduge(){
		boolean bool=true;
		if(this.num.equals("1234")&&this.password.equals("4321")){
			
		}else{
			bool=false;
		}
		return bool;
		
		
	}
}
