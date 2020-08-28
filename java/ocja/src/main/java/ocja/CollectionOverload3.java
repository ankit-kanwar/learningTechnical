package ocja;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class P19{
	public List<Number> m1(Set<CharSequence> c){
		System.out.println("parent");
		return null;
	}
}

class C19 extends P19{
	public List<Integer> m1(HashSet<String> s){
		System.out.println("child");
		return null;
	}
}
public class CollectionOverload3 {
	public static void main(String[] args) {
		C19 c19 = new C19();
		c19.m1(new HashSet<String>());
		
	}
}
