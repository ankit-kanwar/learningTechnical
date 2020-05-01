package ocja;


interface Default{
	default void m1() {
		System.out.println("default method of interface");
	};
	
	/*default String toString() {
		return "custom toString";
	}
	
	default int hashCode() {
		return 10;
	}*/

}
public class DefaultKeyword implements Default{

	public static void main(String[] args) {
		var v = new DefaultKeyword();
		v.m1();

	};
	
	
}
