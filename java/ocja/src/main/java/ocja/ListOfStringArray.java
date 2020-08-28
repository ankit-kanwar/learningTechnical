package ocja;

import java.util.List;

public class ListOfStringArray {

	public static void main(String[] args) {
		
		var list = List.of(new String[]{"A", "BB", "CCC"}, new String[]{"DD", "E"}); //Line n1
        list.forEach(x -> System.out.print(x.length)); //Line n2

	}

}
