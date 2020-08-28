package ocja;

public class Wrapper4 {

	public static void main(String[] args) {
		
		Integer i = Integer.valueOf("1111");
		String s=  i.toString();
		System.out.println(s);
		
		
		String s2 = Integer.toString(10);
		System.out.println(s2);
		
		
		String bst = Integer.toString(102, 2);
		System.out.printf("bst:%s",bst);
		
		String hexStr = Integer.toHexString(10);
		System.out.println("\nhex string:"+hexStr);
	}

}
