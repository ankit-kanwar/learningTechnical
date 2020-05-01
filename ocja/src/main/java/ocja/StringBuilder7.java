package ocja;

public class StringBuilder7 {

	public static void main(String[] args) {
		
		var sb = new StringBuilder("durgasoft");
		sb.replace(sb.indexOf("r"), sb.indexOf("o"), "x");
		System.out.println(sb);
	}

}
