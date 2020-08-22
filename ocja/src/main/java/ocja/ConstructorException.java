package ocja;

import java.io.IOException;

class P14{
	P14() throws IOException{
		System.out.println("Hakuna");
	}
}
public class ConstructorException extends P14 {

	ConstructorException() throws Exception {
		System.out.println("Matata");
	}
	
	public static void main(String[] args) throws Exception {
		new ConstructorException();
	}

}
