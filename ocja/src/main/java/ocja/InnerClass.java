package ocja;

public class InnerClass {
	
	private static class A{
		public void m1() {
			System.out.println("a");
		}
	}
	
	protected static class B{
		public void m1() {
			System.out.println("b");
		}
	}
	public static void main(String[] args) {
		A a = new  A();
		B b = new B();
		a.m1();
		b.m1();
		System.out.println("c");

	}

}
