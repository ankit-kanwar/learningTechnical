package ocja;

public class LabelledBlock {

	public static void main(String[] args) {
		int x=10;
		
		l1:{
			System.out.println("label begin");
			if(x==10) break l1;
			System.out.println("label ending");
			
		}
		System.out.println("outside label");

	}

}
