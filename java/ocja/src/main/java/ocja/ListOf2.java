package ocja;

import java.util.Arrays;
import java.util.List;

public class ListOf2 {

	public static void main(String[] args) {
		String []arr = {"Earth","Moon","Sun","Pluto"};
		var list = List.of(arr);
		var list1 = Arrays.asList(arr);
		list.add("Mars");
		//list.set(3, "Jupiter");
		list.forEach(str -> System.out.println(str));
		
		var sb = new StringBuilder("str");

	}

}
