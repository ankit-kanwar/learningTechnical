package ocja;

public class SwitchFinal {
	
	public static void main(String[] args) {
		final int x=10;
		switch(x){
		case 200:
			System.out.println("200");
		case x:
			System.out.println("x");
		}
	}
}
