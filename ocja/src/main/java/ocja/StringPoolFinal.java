package ocja;

public class StringPoolFinal {

	public static void main(String[] args) {
		final String s1 = "abc";
		String s2 = s1+"def";
		String s3="abcdef";
		System.out.println(s2==s3);

	}

}
