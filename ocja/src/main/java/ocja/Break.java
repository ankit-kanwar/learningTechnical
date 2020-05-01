package ocja;

public class Break {

	public static void main(String[] args) {
		int i=10;
		for(int j=0;j<3;j++) {
			if(i==10) {
				break;
				//System.out.println("ending if");
			}
			System.out.println("ending loop");
		}
		System.out.println("enging main");

	}

}
