package ocja;


interface M{
	public static void log() {
		System.out.println("interface M");
	}
}

abstract class N {
	public static void log() {
		System.out.println("abtstract class N");
	}
}

class MyClass extends N implements M{
	
}
public class StaticOverridingMultipleInheritance {

	public static void main(String[] args) {
		M m = new MyClass();
		//m.log();
		
		N n = new MyClass();
		n.log();
		
		MyClass myClass = new MyClass();
		myClass.log();

	}

}
