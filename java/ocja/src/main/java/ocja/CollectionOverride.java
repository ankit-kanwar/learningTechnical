package ocja;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P15{
	private Collection collection;
	public void m1(Collection collection) {
		this.collection=collection;
		System.out.println("in parent");
	}
}

class C15 extends P15{
	public void m1(Map<String,String> map) {
		System.out.println("in child");
		//super.m1(map);
		//m1(map);
		//super.m1(List<Integer> map);
		 super.m1(map.values());
		m1(map.values());
	}
}
public class CollectionOverride {

	public static void main(String[] args) {
		new C15().m1(new HashMap<String,String>());
	}

}
