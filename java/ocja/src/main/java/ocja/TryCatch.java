package ocja;

public class TryCatch {

	public static void main(String[] args) {
		try {
			//test();
		}finally {
			System.out.println("game on");
		}

	}

	private static void test() throws Exception{
		throw new Exception();
		
	}

}
