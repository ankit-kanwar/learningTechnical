package ocja.questions;

public class Test {
	
	static boolean x;
	static boolean y;

	public static void main(String[] args) {
		x = x||y && !x;
		y = y && x || y;
		
		System.out.println(x+":"+y);
	}

}
