package ocja;

import java.io.IOException;

interface IA{
	public Object m1() throws IOException;
}

interface IB{
	public String m1() throws Exception;
}

class CA implements IB{
	/*public String m1() throws IOException{
		return null;
	}*/
	
	/*public String m1() {
		return null;
	}*/
	
	public String m1() throws ArithmeticException{
		return null;
	}
}
