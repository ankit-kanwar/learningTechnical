package ocja;

import java.util.ArrayList;

public class ArrayListSublist {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("yellow");
		list.add("green");
		list.add("purple");
		list.add("green");
		
		System.out.println(list.subList(2, 5));
		System.out.println(list.subList(3, 3));
		System.out.println(list);

	}

}
