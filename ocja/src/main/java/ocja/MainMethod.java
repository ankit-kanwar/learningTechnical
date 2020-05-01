package ocja;

public class MainMethod {

	public static void main(String[] args) {
		//m1(new String[] {"ankit"});
		main(new String[] {new String()});
		System.out.println("in first main");
	}
	
	public static void main(Object[] args) {
		System.out.println("in second main");
	}

}
