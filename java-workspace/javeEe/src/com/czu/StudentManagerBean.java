package com.czu;

public class StudentManagerBean {
	public void info(){
		
	}
	public StudentBean getStudentInfoById(String id){
		StudentBean sb=new StudentBean();
		sb.setStudentId("14030413");
		sb.setStudentName("李丁");
		if("14030413".equals(id))
			return sb;
		else
			return null;
	}
}
