package day2;

import org.junit.Test;

public class Array {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = { 7, 2, 9, 4, 5, 6, 1, 8, 3 };
		int max = array[0];
		int min = array[0];
		
		for (int i : array) {
			if (1 == i % 2) {
				System.out.println("Odd：" + i);
			} else {
				System.out.println("Even numbers：" + i);
			}
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		System.out.println("Maximum value：" + max);
		System.out.println("minimum value：" + min);
	}
	@Test
	public void add(){
		System.out.println("as");
	}

}
