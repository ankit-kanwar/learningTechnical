package ocja.dumps;

import ocja.Constructor5;

public class ArrayTest {

	public static void main(String[] args) {
		
		int data[] = {2010,2013,2014,2015,2014};
		int key = 2014;
		int count = 0;
		for(int e:data) {
			if(e != key) {
				continue;
				//count++;
			}
		}
		
		int[] x;
		//x= {10,20};
		
		int[] y = {1,2,3,4};
		//System.out.println(y.length);
		
		//(new int[4] {10,20,30}).toString();
		
		//int[] z = new int[3] {1,2,3};
		
		int[] a = {10,20,30,40};
		int[] b = {50,60};
		a=b;
		b=a;
		System.out.println(a.length +" "+ a);
		System.out.println(b.length +" "+ b);
		
		int[][] c = new int[3][2];
		c[0] = new int[4];

	}

}
