package ocja;


class P11{
	int x=777;
}

class C11 extends P11{
	int x=888;
}

class GC10 extends C11{
	int x=999;
}
public class ObjectTypeCasting4 { 

	public static void main(String[] args) {
		var gc10 = new GC10();
		System.out.println(gc10.x);
		System.out.println( ((C11) gc10).x);
		System.out.println(  ((P11) ((C11)gc10)).x);
	}

}
