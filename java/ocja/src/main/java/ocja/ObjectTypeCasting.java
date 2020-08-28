package ocja;

public class ObjectTypeCasting {

	public static void main(String[] args) {
		Object o = new String("str");
		StringBuffer sb = (StringBuffer) o;
		System.out.println(sb);
		
		/*String s = new String("str");
		StringBuffer sb2 = (StringBuffer)s;*/
	}

}
