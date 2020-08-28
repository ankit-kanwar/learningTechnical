package ocja;


public class Constructor5{
	
	Constructor5(){  // this constructor's scope is default I just checked
		super();
		System.out.println("constructor5");
	}
	
	public static void main(String[] args) {
		var c5 = new Constructor5();
	}
	
}
