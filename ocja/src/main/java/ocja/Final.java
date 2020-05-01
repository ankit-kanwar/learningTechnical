package ocja;

public class Final {
	
	public final void m1() {
		System.out.println("m1");
	}
	
	public void m1(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		var f = new Final();
		f.m1();
		f.m1("param");

	}

}
