package ocja;

public class SwitchDefault2 {

	public static void main(String[] args) {
		String furniture = new String(new char[] {'S','o','f','a'});
		
		switch(furniture) {
			default:
				System.out.println("CHAIR");
			case "Recliner":
				System.out.println("RECLINER");
			case "Sofa":
				System.out.println("SOFA");
			case "Bed":
				System.out.println("BED");
			break;
		}

	}

}
