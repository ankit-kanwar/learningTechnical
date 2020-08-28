package ocja;

class P13{
  int x=10;
}


public class SuperThis2 extends P13{
	int x=20;
	public static void main(String[] args) {
		new SuperThis2().m1();
	}
	private void m1() {
		int y = super.x;
		System.out.println(y);
		
	}

}
