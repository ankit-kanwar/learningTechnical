package ocja;

class X{
	void greet() {
		System.out.println("Good Morning");
	}
}

class Y extends X{
	void greet() {
		System.out.println("Good Afternoon");
	}
}

class Z extends Y{
	void greet() {
		System.out.println("Good Night");
	}
}
public class InheritanceCasting {

	public static void main(String[] args) {
		X x = new Z();
		x.greet();
		((Y)x).greet();
		((Z)x).greet();
		((X)x).greet();
	}

}
