package ocja;


interface Interfa1{
	default void m1() {
		System.out.println("Interfa1 default method");
	}
}

interface Interfa2{
	default void m1() {
		System.out.println("Interfa2 default method");
	}
}
public class DefaultMethodMultipleInheritance implements Interfa1,Interfa2{

	public static void main(String[] args) {
		new DefaultMethodMultipleInheritance().m1();

	}

	@Override
	public void m1() { 
		Interfa1.super.m1();
	}
	
	/*public void m1() {
		System.out.println("default method implemented");
	}*/

}
