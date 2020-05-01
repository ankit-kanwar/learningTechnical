package ocja;

public class ForLoop4 {

	public static void main(String[] args) {
		
		for(byte b=0;;b++) {
			System.out.println(b);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
