package ocja;

class Parent5{
	public void m1(int... arg) {
		System.out.println("in parent54");
	}
}

class Child5 extends Parent5{
	public void m1(int[] arg) {
		System.out.println("in child5");

	}
}
public class PolymorphismDynamicVararg {

	public static void main(String[] args) {
		Parent5 p = new Parent5();
		p.m1(10);
		
		Child5 c = new Child5();
		//c.m1(10);
		
		Parent5 p1 = new Child5();
		p1.m1(10);
	}

}
