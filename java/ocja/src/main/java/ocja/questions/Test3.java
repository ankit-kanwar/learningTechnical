package ocja.questions;

public class Test3 {

	public static void main(String[] args) {
		
		int x=1,y=2;
		x+=x < y ? y:x;
		y=x<y ? y-x:y+x;
		
		System.out.println(x+":"+y);
	}

}
