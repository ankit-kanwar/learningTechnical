package ocja;

public class StringBuilder8 {

	public static void main(String[] args) {
		
		var sb = new StringBuilder("HI");
		sb.append(new StringBuilder("HELLO"));
		//sb=sb+"HEY";
		sb.append("OYE");
		System.out.println(sb);
	}

}
