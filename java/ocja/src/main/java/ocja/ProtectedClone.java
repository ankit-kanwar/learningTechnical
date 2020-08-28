package ocja;

public class ProtectedClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dummy d =  new Dummy();
		//Dummy d2 = (Dummy)d.clone();
		
		ProtectedClone pc = new ProtectedClone();
		ProtectedClone pc2 = (ProtectedClone)pc.clone();

	}

}
