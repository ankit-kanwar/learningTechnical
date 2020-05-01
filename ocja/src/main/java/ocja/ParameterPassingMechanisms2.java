package ocja;

public class ParameterPassingMechanisms2 {
	int x;
	public int m1(int x) {
		this.x  = this.x+x*x;
		return x;
	}
	public static void main(String[] args) {
		int x=10;
		var o = new ParameterPassingMechanisms2();
		System.out.print(o.m1(x)+":");
		System.out.print(o.m1(x)+":");
		System.out.print(o.x+x);
	}

}
