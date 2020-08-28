package ocja;


class Demo{
	int x;
	int y;
}
public class PassingParamaterMechanisms3 {
	
	public void m1(Demo d) {
		d.x=888;
		d.y=999;
		System.out.println("in method m1 d.x :"+d.x+"|d.y :"+d.y);
	}
	
	public static void main(String[] args) {
		var d = new Demo();
		d.x=10;
		d.y=20;
		var p = new PassingParamaterMechanisms3();
		p.m1(d);
		System.out.println("In main method d.x :"+d.x+"d.y :"+d.y);

	}

}
