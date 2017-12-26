package cn.czu.user;

public class UserBean {
	
	private String userID;
	private String userPassWord;
	private String userSex;
	
	public String getUserID(){
		return this.userID;
	}

	public void setUserID(String userID){
		this.userID=userID;
	}
	
	public String getuserPassWord(){
		return this.userPassWord;
	}

	public void setuserPassWord(String userPassWord){
		this.userPassWord=userPassWord;
	}
	
	public String getuserSex(){
		return this.userSex;
	}

	public void setuserSex(String userSex){
		this.userSex=userSex;
	}


}
