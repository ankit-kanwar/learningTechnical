package ocja;

public class Wrapper5 {

	public static void main(String[] args) {
		int x=10;
		//m1(x);
		m2(x);
	}

	private static void m2(Object x) {
		System.out.println("Object");
		
	}

	private static void m1(Long x) {
		System.out.println("Long");
	}

}
