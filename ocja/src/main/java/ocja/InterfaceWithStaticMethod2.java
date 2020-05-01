package ocja;

interface Interfac2{
	public static int sum(int a,int b) {
		return a+b;
	}
}
public class InterfaceWithStaticMethod2 implements Interfac2{

	public static int sum(int a,int b) {
		return a+b+1;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,1));
		System.out.println(Interfac2.sum(1, 1));
	}

}


