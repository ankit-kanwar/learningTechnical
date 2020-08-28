package ocja;

public class ParameterPassingMechanisms15 {
	int x;
	
	public void m1(int x) {
		this.x = x+x*x;
	}
	public static void main(String[] args) {
		int x=10;
		var ppm15 = new ParameterPassingMechanisms15();
		ppm15.m1(x);
		ppm15.m1(x);
		ppm15.m1(x);
		System.out.println(ppm15.x+x);
		

	}

}
