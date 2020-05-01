package ocja;

public class MethodOverloading {
	public static void main(String[] args) {
		var mo = new MethodOverloading();
		mo.m1(10);
	}
	
	public void m1() {
		
	}
	
	public void m1(double a) {
		System.out.println(a);
	}
}
