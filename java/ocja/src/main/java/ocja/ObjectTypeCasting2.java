package ocja;

public class ObjectTypeCasting2 {

	public static void main(String[] args) {
		String s = new String("str");
		Object o = (Object) s;
		
		//System.out.println(s==o);
		
		
		/* only one object but three references*/
		Integer i = new Integer(10);
		Number n = (Number)i;
		Object obj = (Object)n;
		System.out.println(obj);
		System.out.println(i==n);
		System.out.println(n==obj);
		System.out.println(obj==i);
	}

}
