package ocja;


interface Default2{
	default void m1() {
		System.out.println("default method of interface");
	};

}
public class DefaultKeyword2 implements Default2{

	public static void main(String[] args) {
		var v = new DefaultKeyword2();
		v.m1();

	};
	
	public void m1() {
		System.out.println("overridden default method of interface");
	}
	
	
}
