package ocja;


class P10{
	public void m1() {
		System.out.println("p10");
	}
}

class C10 extends P10{
	public void m2() {
		System.out.println("c10");
	 }
}
public class ObjectTypeCasting3 { 

	public static void main(String[] args) {
		C10 c10 = new C10();
		c10.m1();
		c10.m2();
		((P10)c10).m1();
		//((P10)c10).m2();
	}

}
