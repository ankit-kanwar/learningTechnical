package ocja;

public class ForLoop {

	public static void main(String[] args) {
		//int x=0,String y="a";
		
		String x=null;
		for(x="1";!x.equals("1aaa");x.concat("a")) {
			System.out.println(x);
			x+="a";
		}
	}

}
