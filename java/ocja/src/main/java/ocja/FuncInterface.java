package ocja;

import java.util.function.Predicate;

public class FuncInterface {

	public static void main(String[] args) {
		boolean rzlt = test(10, x ->  x>10 );
		System.out.println(rzlt);

	}

	private static boolean test(int i, Predicate<Integer> func) {	
		return func.test(i);
	}

}
