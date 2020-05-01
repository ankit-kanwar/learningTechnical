package ocja;

class Alpha{
  public String type ="a";
  public Alpha() {
	  System.out.println("alpha");
  }
}

public class SuperThis extends Alpha{
	
	public SuperThis() {
		System.out.println("beta");
	}
	
	void m1() {
		type="b";
		System.out.println(this.type+super.type);
	}
	
	public static void main(String[] args) {
		new SuperThis().m1();
	}
}
