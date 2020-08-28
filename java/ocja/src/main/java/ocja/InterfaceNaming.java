package ocja;


interface Interf1{
	String s="1";
}

interface Interf2{
	String s="2";
}
public class InterfaceNaming implements Interf1,Interf2{

	public static void main(String[] args) {
		// System.out.println(s);
		System.out.println(Interf1.s);
		System.out.println(Interf2.s);
	}
}
