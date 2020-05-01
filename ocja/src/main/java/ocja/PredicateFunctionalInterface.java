package ocja;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = x -> x%2==0;
		Predicate<Integer> p1 = x -> x>10;
		System.out.println(p.and(p1).test(6));
		
		
	}

}
