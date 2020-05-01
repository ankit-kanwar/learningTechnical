package ocja;

public class Switch {

	public static void main(String[] args) {
		int x=10;
		switch(x) {
		
		}
		
		switch(x) {
		case 20:
			System.out.println("20");
		case 10:
			//System.out.println("10");
		}
		
		switch(x) {
		 default:
			 //System.out.println("default");
		}
		
		switch(x){
			//System.out.println("hmm");
		}
		
		final int y=20;
		switch(y) {
		case 100+10:
			//System.out.println("200");
		case y:
			//System.out.println("x");
		}
		
		switch(20) {
		
		}
		
		switch(x+1) {
		
		}
		
		
		byte b=10;
		switch(b) {
		case 10:
			System.out.println("10");
		case 100:
			System.out.println("100");
			break;
		case 120:
			System.out.println("120");
		//case 1000:
			//System.out.println();
		}
		
		//System.out.println('a');
		//System.out.println(97);
		
		byte var = 'a';
		switch(var) {
		case 97:
			//System.out.println(97);
		case 'b':
			//System.out.println('a');
		}
		
		
		String str="1234";
		switch(str) {
		case "1234":
			//System.out.println(1234);
		//case 10:
			//System.out.println(10);
		}
		
	}

}
