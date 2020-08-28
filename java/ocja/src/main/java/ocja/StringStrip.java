package ocja;

public class StringStrip {

	public static void main(String[] args) {
		String str=" ";
		boolean b1 = str.isEmpty();
		boolean b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n1
        
        str.strip(); //Line n2
        b1 = str.isEmpty();
        b2 = str.isBlank();
        System.out.println(b1 + " : " + b2); //Line n3

	}

}
