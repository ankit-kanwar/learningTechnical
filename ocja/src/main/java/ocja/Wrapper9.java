package ocja;

import java.util.ArrayList;
import java.util.List;

public class Wrapper9 {
	public  static void main(String[] x) {
		List<String> list = new ArrayList<>();
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("THREE");
		if(list.remove("THREE")) {
			list.remove(2);
		}
		System.out.println(list);
		
	}

}
