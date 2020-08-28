package ocja;

public class ForEach {

	public static void main(String[] args) {
		String[] s = new String[4];
		s[0]="0";
		s[1]="1";
		s[2]="2";
		for (String string : s) {
			System.out.println(string.length());
		}
	}

}
