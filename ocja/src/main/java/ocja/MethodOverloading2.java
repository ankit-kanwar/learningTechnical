package ocja;

public class MethodOverloading2 {
	public static void main(String[] args) {
		var mo = new MethodOverloading2();
		mo.m1(new Object());
		mo.m1("ankit");
		mo.m1(null);
	}
	
	public void m1(Object o) {
		System.out.println("object arg");
	}
	
	public void m1(String a) {
		System.out.println("string arg");
	}
}
