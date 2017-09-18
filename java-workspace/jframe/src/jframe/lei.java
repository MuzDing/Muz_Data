package jframe;

public class lei {
	private static lei instance = new lei();
	private lei(){
	
	}
	public static lei getInstance(){
		return instance;
	}
}
