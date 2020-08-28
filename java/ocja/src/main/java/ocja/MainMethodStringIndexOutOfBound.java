package ocja;

import java.io.FileNotFoundException;

public class MainMethodStringIndexOutOfBound {

	public static void main(String[] args) {
		try {
		args[1] = "Day1";
		System.out.println(args[0]+":"+args[1]);
		}/*catch(Exception | FileNotFoundException e) {
			
		}*/finally {
			
		}
	}

}
