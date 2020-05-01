package ocja;

public class MethodRecursive {
	private void m1() {
		m2();
	}
	
	private void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		new MethodRecursive().m1();
	}

}
