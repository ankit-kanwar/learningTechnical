package ocja.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListOf {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("A","E","I","O","U"));
		if(verify( list, l->l.remove("I") ))
			if(verify(list, l -> l.add("I"))) {
				
			}
		System.out.println(list);
			

	}
	
	private static boolean verify(List<String> list,Predicate<List<String>> predicate) {
		return predicate.test(list);
	}

}
