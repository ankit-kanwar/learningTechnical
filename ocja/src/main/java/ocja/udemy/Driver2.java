package ocja.udemy;

public class Driver2 {
	
	private static void div(int i,int j) {
		try {
			System.out.println(i/j);
		}catch(ArithmeticException e) {
			Exception ex = new Exception(e);
			//throw ex;
		}
	}
	public static void main(String[] args) {
		

	}

}
