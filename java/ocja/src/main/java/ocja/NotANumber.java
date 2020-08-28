package ocja;

public class NotANumber {

	public static void main(String[] args) {
		System.out.println(Float.NaN != 10);
		System.out.println(Float.NaN != Float.NaN);
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(10>Float.NaN);
		
		System.out.println(10<10.0);
		
		//System.out.println("Ankit"<"Kanwar");
		
		System.out.println(null==null);
		
		StringBuffer sb = null;
		System.out.println(sb==null);

	}

}
