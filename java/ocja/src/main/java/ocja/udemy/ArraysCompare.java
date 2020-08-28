package ocja.udemy;

import java.util.Arrays;

public class ArraysCompare {

	public static void main(String[] args) {
		System.out.println(Arrays.compare(new char[] {'A','C','E' }, new char[] {'A'}));
		
		System.out.println(Arrays.compare( new char[] {'A'} , new char[] {'A','C','E' }));
		
		System.out.println(Arrays.compare(new char[] {'A','C','E' }, new char[] {'Y','V'}));
		
		System.out.println(Arrays.compare((int [])null, (int [])null));

	}

}
