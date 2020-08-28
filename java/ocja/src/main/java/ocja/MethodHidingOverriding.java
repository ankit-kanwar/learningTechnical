package ocja;

class P32{
	public static void  m1() {
		System.out.println("parent static method m1");
	}
	
	public void m2() {
		System.out.println("parent method m2");
	}
}

class C32 extends P32{
	public static void m1() {
		System.out.println("child static m1");
	}
	
	public void m2() {
		System.out.println("child method m2");
	}
}
public class MethodHidingOverriding {
	
	
	public static void main(String[] args) {
		P32 p32 = new P32();
		C32 c32 = new C32();
		P32 p321 = new C32();
		
		p32.m2();
		p32.m1();
		
		c32.m2();
		c32.m1();
		
		p321.m2();
		p321.m1();
	}
	
	
	
}
