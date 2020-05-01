package ocja;

@FunctionalInterface
interface InterfaceA{
	int square(int x);
}
public class Functionalnterface {

	public static void main(String[] args) {
		InterfaceA a = x -> x*x;
		
		System.out.println(a.square(10));

	}

}
