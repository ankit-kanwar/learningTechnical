package ocja.udemy;

class M{
	
}

class N extends M{
	
}

class O extends N{
	
}

class P extends O{
	
}
public class InstanceOfOp {

	public static void main(String[] args) {
		M obj = new O();
		if(obj instanceof M)
			System.out.println("M");
		if(obj instanceof N)
			System.out.println("N");
		if(obj instanceof O)
			System.out.println("O");
		if(obj instanceof P)
			System.out.println("P");
	}

}
