package ocja.questions;

class Foo{
	protected String myField = "Foo";
	
	protected static Object myMethod() {
		return "Foo";
	}
}
public class Test2 extends Foo{
	
	public String myField="Bar";
	
	/*public String myMethod() {
		return "Bar";
	}*/

	public static void main(String[] args) {
		Foo foo = new Test2();
		System.out.println(foo.myField);
		System.out.println(foo.myMethod());

	}

}
