package ocja;

public class TryCatchWithMultipleExceptionCatchInCatchBlock {

	private static String s;
	public static void main(String[] args) {
		try {
			System.out.println(s.length());
		}catch(ArithmeticException  | NullPointerException re){
			System.out.println("done");
		}

	}

}
