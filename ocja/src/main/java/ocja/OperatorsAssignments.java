package ocja;

public class OperatorsAssignments {

	public static void main(String[] args) {
		//int y = ++(++x);
		
		byte a = 127;
		a++;
		//System.out.println(a);
		
		final byte b1 = 10;
		final byte b2 = 28;
		byte c = b1+b2;
		System.out.println(c);
		
		
		//System.out.println('a'+'b');
		
		//System.out.println(10/0);
		//System.out.println(10.0/0);
		//System.out.println(0/0);
		//System.out.println(0.0/0);
		
		//System.out.println(-10.0/0);
		//System.out.println(-0/0.0);
		
		System.out.println(10 != Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(10>Float.NaN);
		
		
	}

}
