package test;

import java.util.Scanner;

public class jisuanqi {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Double num1=0.0,num2=0.0;
		String fuhao;
		num1=input();
		num2=input();
		fuhao=inputString();
		Double z = jisuan(fuhao,num1,num2);
		System.out.println(z);	
	}
	private static String inputString() {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入符号");
		return sc.nextLine();	
	}
	public static Double add(Double num1,Double num2){
		return num1+num2;
	}
	public static Double jian(Double num1,Double num2){
		return num1-num2;
	}
	public static Double cheng(Double num1,Double num2){
		return num1*num2;
	}
	public static Double chu(Double num1,Double num2){
		return num1/num2;
	}
	public static double input(){
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入数字");
		return sc.nextDouble();	
	}
	public static Double jisuan(String fuhao,Double x,Double y){
		if("+".equals(fuhao)){
			return add(x,y);
		}else if("-".equals(fuhao)){
			return jian(x,y);
		}else if("*".equals(fuhao)){
			return cheng(x,y);
		}else if("/".equals(fuhao)){
			return chu(x,y);
		}
		return null;	
	}
}
