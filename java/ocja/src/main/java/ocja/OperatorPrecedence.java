package ocja;

public class OperatorPrecedence {

	public static void main(String[] args) {
		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6 ));

	}

	private static int m1(int i) {
		System.out.println(i);
		return i;
	}

}
