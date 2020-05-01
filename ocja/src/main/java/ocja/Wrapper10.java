package ocja;

import java.util.ArrayList;
import java.util.List;

public class Wrapper10 {
	public  static void main(String[] x) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(25);
		list.remove(Integer.valueOf(15));
		System.out.println(list);
		
	}

}
