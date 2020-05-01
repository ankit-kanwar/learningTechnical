package ocja;

public class Arrays1 {

	public static void main(String[] args) {
		int[] x;
		int []y;
		int z[];
		int a   [];  //the space b/w variable and dimension is ignored by the compiler
		
		
		int[][] b;
		int [][]c;
		int d[][];
		
		int[] []e;
		int[] f[];
		int []g[]; 
		
		int[] h,i;
		
		int[] j,k[];
		
		k = new int[4][4];
		//int[] l,[]m;   //compile time error
		
		//System.out.println("class name for 2D array:"+k.getClass().getName());
		
		
		//int[] m = new int[];    //no size in declaration compile time error
		int[] n = new int[0];   //syntactically correct but no use
		
		//int[] o = new int[-3];  //compiler checks just the data type which is int and compiles fine
		//System.out.println(o[0]);
		
		
		int[] p = new int['a'];
		//System.out.println("Array with size in character:"+p.length);
		
		
		int[][] q = new int[5][];
		q[0] = new int[2];
		
		//int[][][] r = new int[5][][2];   //compile time error bcoz without specifying second dimension we cannot have third dimension
		
		
		//array variable assignments
		int[] r = {10,20,30};
		char[] s = {'a','b','c'};
		
		int[] t = r;
		//int[] u = s;
		
		String[]  u = {"ankit","kanwar"};
		Object[]  v = u;
		
		Object[] w = new String[3];
		//w[0] = new Object();
		w[1] = new String();
		
		//((String) w[1]).charAt(0);
		
		
		int[] a2 = {10,20,30,40,50};
		int[] a1 = {60,70};
		a1=a2;
		//a2=a1;
		//System.out.println("a1 :"+a1[0]+""+a1[1]+a1[0]+""+a1[3]+""+a1[4]);
		//System.out.println("a2 :"+a2[0]+""+a2[1]+a1[2]+""+a1[3]+""+a1[4]);
		
		
		int[][] b1 = new int[3][];
		//b1[0] = new int[4][5];
		//b1[0] = 10;
		b1[0] = new int[4];
		
		
		String[] c1 = {"A","B","C"};
		String[] c2 = {"D","E"};
		c1 = c2;
		
		for (int ii=0;ii< c1.length;ii++) {
			System.out.println(c1[ii]);
		}
		
		var d1 = new int[] {10,20};
		
		//var e1 = {10,20,30};
		
		
	}

}
