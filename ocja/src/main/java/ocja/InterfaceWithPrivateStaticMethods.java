package ocja;

public interface InterfaceWithPrivateStaticMethods {
	public  static void  m1() {
		m();
		System.out.println("m1 static method");
	}
	
	public  static void  m2() {
		m();
		System.out.println("m2 static method");
	}
	
	private   static void  m() {
		System.out.println("m private static method");
	}
	
	private void m3() {
		System.out.println("m3 private instance method");
	}
}

class InterfaceWithPrivateStaticMethodsConcreteClass implements InterfaceWithPrivateStaticMethods{
	public static void main(String[] args) {
		InterfaceWithPrivateStaticMethods.m1();
		InterfaceWithPrivateStaticMethods.m2();
	}
}
