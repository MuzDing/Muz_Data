package day3;

import org.junit.Test;

public class AmazingNumber {

	@Test
	public void functionone() {
		String str = "*1";
		String str2 = "=9";
		for (int i = 0; i < 9; i++) {
			System.out.println(str + "*" + (8) + "+" + (i + 1) + str2);
			str = str + (i + 2);
			str2 = str2 + (8 - i);
		}
	}

	@Test
	public void functiontwo() {
		String str = "*1";
		String str2 = "=11";
		for (int i = 0; i < 9; i++) {
			System.out.println(str + "*" + (9) + "+" + (i + 2) + str2);
			str = str + (i + 2);
			str2 = str2 + "1";
		}
	}

	@Test
	public void functionthree() {
		String str = "* 9";
		System.out.println("*");
		String str2 = "=88";
		for (int i = 0; i < 8; i++) {
			System.out.println(str + "*" + (9) + "+" + (7 - i) + str2);
			str = str + (8 - i);
			str2 = str2 + (8);
		}
	}
}
