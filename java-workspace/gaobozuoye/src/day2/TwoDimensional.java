package day2;

public class TwoDimensional {

	public static void main(String[] args) {
		int[][] array= new int[20][5]; 
		int[] countScore = new int[20];
		init(array);
		printScore(array);
		countScore(countScore,array);
		averageScore(countScore);
	}
	public static void init(int[][] array){
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				array[i][j]=(int)(Math.random()*100);
			}
		}
	}
	public static void printScore(int[][] array){
		for(int i=0;i<20;i++){
			System.out.println(" core c++:"+array[i][0]+" core java:"+array[i][1]+" Servlet:"+array[i][2]+" Jsp:"+array[i][3]+" EJB:"+array[i][4]);
		}
	}
	public static void countScore(int[] countScore,int[][] array){
		for(int i=0;i<20;i++){
			countScore[i]=array[i][0]+array[i][1]+array[i][2]+array[i][3]+array[i][4];
		}
	}
	public static void averageScore(int[] countScore){
		for(int i=0;i<20;i++){
			System.out.println(countScore[i]/5);
		}
	}
}
