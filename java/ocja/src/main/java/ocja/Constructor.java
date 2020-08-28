package ocja;

public class Constructor {
	{
		System.out.println("instance block");
	}
	
	Constructor(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		new Constructor();

	}

}
