package ocja;

public class Instanceof {

	public static void main(String[] args) {
		var t = new Thread();
		System.out.println(t instanceof Thread);
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		//System.out.println(t instanceof String);

	}

}
