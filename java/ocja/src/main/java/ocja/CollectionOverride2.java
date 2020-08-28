package ocja;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


class P16{
	private Collection collection;
	public void m1(Collection collection) {
		this.collection=collection;
		System.out.println("in parent");
	}
}

class C16 extends P16{
	public void m1(Collection list) {
		System.out.println("in child");
		//super.m1(map);
		//m1(map);
	}
}
public class CollectionOverride2 {

	public static void main(String[] args) {
		P16 p16 = new C16();
		p16.m1(List.of("ankit"));
	}

}
