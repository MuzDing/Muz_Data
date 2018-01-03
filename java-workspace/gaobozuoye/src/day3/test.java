package day3;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		//设置e2的上司
		e2.setUp_boss(e1);
		//添加一个下属信息
		e1.addDownEmployee(e2);
		//打印下属员工的信息
		e1.printDownEmployee();
		//下属员工的总数
		e1.printDownEmployeeCount();
		
	}

}
