package ocja;

public class Cloning2 {

	public static void main(String[] args) {
		int[][] x = {{10,20,30},{40,50,60}};
		int[][] y = x.clone();
		int[] z = x[0].clone();
		
		System.out.println(x==y);
		System.out.println(x[1]==y[1]);
		System.out.println(x[0]==z);
		System.out.println(x.equals(y));
		
		
		
	}
}
