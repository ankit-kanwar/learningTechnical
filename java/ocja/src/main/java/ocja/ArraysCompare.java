package ocja;

import java.util.Arrays;

public class ArraysCompare {

	public static void main(String[] args) {
		
		int[] i1 = null;
		int []i2 = {1,2,12,34};
		int []i3 = {1,2,47};
		
		System.out.println(Arrays.compare(i1, i2));
		
		System.out.println(Arrays.compare(i2, i3));

	}

}
