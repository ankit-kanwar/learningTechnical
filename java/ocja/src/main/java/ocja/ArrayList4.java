package ocja;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		
		List<String> list;
		list = new ArrayList<>();
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		list.addAll(list.subList(0, 4));
		
		

	}

}
