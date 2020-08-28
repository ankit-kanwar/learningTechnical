package ocja;

public class StringPool {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";
		String s5 = s1.intern();
		String s6 = s2.intern();
		String s7 = s3.intern();
		
		System.out.println((s1==s2)+":"+(s3==s4)+":"+(s3==s5)+":"+(s4==s6));

	}

}
