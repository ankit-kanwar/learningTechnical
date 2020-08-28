package ocja.dumps;

public class StringTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if(sb.equals(s))	System.out.println("match 1");
		else if(sb.toString().equals(s.toString())) System.out.println("match 2");
		else 	System.out.println("no match");
		
		
		String str = " ";
		str = str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
		
	}
}
