package ocja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUnmodifiable2 {
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<>(); 
		l.add("a");
		l.add("b");
		l.add("c");
		l=Collections.unmodifiableList(l);
		l.add("d");
		System.out.println(l);
	}

}
