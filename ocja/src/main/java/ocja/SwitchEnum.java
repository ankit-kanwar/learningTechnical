package ocja;


enum Beer{
	KF,KO,RC,FO
}
public class SwitchEnum {
	public static void main(String[] args) {
		double price=0;
		for(Beer beer:Beer.values()) {
			switch(beer){
			case KF:
			case KO: YADAYADAYADA:
				price+=150.0;
				break;
			//case RC:
			case FO:
				price+=75.0;
			default:
				price+=60.0;
			}
		}
	System.out.println("total price :"+price);
	}	
}
