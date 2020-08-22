package ocja;

import java.util.Arrays;

public class ArraysMismatch2 {

	public static void main(String[] args) {
		int[] i1 = null;
		int []i2 = {1,2,12,34};
		
		int[] i3 = null;
		int []i4 = null;
		
		int []i5 = {1,2,3,4,5,9,10,11};
		int i6[] = {1,2,3,5,5};
		
		//System.out.println(Arrays.mismatch(i1, i2));
		
		//System.out.println(Arrays.mismatch(i3, i4));
		
		System.out.println(Arrays.mismatch(i5, i6));

	}

}
