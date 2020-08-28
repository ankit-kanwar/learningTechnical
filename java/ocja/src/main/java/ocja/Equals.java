package ocja;

public class Equals {

	public static void main(String[] args) {
		Thread t = new Thread();
		String s = new String("Durga");
		//System.out.println(t==s);
		
		String str = new String("durga");
		StringBuilder sb = new StringBuilder("durga");
		System.out.println(str.equals(sb));
		//System.out.println(str == sb);

	}

}
