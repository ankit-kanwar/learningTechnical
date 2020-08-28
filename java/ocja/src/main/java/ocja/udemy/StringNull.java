package ocja.udemy;

public class StringNull {

	public static void main(String[] args) {
		String text=null;
		//System.out.println(text.repeat(3));//null pointer
		//System.out.println(null+null+null);//compilation error
		//System.out.println(null+"null"+null);
		//System.out.println(text*=3);//compilation error
		//System.out.println(text+="null".repeat(2));
		//System.out.println(text+text+text);
		text+=null;
		System.out.println(text.concat(null));
	}

}
