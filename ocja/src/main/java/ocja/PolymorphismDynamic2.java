package ocja;

class Parent3{
	private void m1() {
		System.out.println("in parent3");
	}
}

class Child3 extends Parent3{
	public void m1() {
		System.out.println("in child3");

	}
}
public class PolymorphismDynamic2 {

	public static void main(String[] args) {
		Parent3 p3 = new Child3();
	}

}
