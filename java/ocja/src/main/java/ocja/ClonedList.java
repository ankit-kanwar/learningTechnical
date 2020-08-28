package ocja;

import java.util.ArrayList;

public class ClonedList {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(10);
		
		var cloned = (ArrayList<Integer>) list.clone();
		Integer i1 = cloned.get(0);
		i1++;
		System.out.println(cloned);
	}

}
