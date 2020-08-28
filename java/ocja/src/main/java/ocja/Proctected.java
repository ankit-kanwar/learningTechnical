package ocja;


class XYZ{
	
	protected void m1() {
		System.out.println("m1 method from XYZ class");
	}
	
}

public class Proctected extends XYZ{

	public static void main(String[] args) {
		var xyz = new XYZ();
		xyz.m1();
		
		var proctecedClass = new Proctected();
		proctecedClass.m1();
		
		XYZ parentRef = new Proctected();
		parentRef.m1();
	}
	
	protected void m1() {
		System.out.println("m1 method from Proctected class");
	}

}
