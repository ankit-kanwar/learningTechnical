package ocja;

interface Interfac{
	public static int sum(int a,int b) {
		return a+b;
	}
}
public class InterfaceWithStaticMethod implements Interfac{

	/*public static void main(String[] args) {
		sum(1,2);
		InterfaceWithDefaultMethod.sum();
		var i = new InterfaceWithDefaultMethod();
		i.m1();
		System.out.println(Interfac.sum(1, 2));

	}*/

}

class Eg{
	public static void main(String[] args) {
		System.out.println(Interfac.sum(2, 3));
	}
}
