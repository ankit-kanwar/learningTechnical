package ocja;

import java.util.Scanner;

public class DoWhileScanner {

	public static void main(String[] args) {
		String input = null;
		try(Scanner s = new Scanner(System.in)){
		do {
			input = s.nextLine();
		}while( !"ankit".equals(input) );
		}catch(Exception e) {
			
		}
	}

}
