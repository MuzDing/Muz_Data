package com.example.android2;

public class User {
	private String num;
	private String Password;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public boolean Check(User user){
		boolean bool=true;
		if((user.getNum().equals("1234")&&user.getPassword().equals("4321"))){
			
		}else{
			bool=false;
		}
		return bool;
		
	}
}
