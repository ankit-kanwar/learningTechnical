package ocja;

public class StringBuilder6 {

	public static void main(String[] args) {
		var s = new String("1234-2678-7860-2345");
		var sb = new StringBuilder("XXXX-XXXX-XXXX-XX");
		sb.append(s,17,19);
		System.out.println(sb);
	}

}
