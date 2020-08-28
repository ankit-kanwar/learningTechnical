package ocja;

public class FinalLocal {
	public static void main(String[] args) {
		m1(10,20);
	}

	private static void m1(final int i, int j) {
		//i=100;
		j=200;
		System.out.println("i:j|"+i+":"+j);
		
	}

}
