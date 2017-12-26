package zhangxiaofang;

public class mypoint {
	double x,y;
	public mypoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double distance(mypoint p1,mypoint p2)
	{
		double count=0;
		
		count =Math.sqrt(Math.pow(p2.y-p1.y, 2)+Math.pow(p2.x-p1.x, 2));
		return count;
	}
}
