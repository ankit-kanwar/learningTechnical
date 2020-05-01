package ocja;

class Par{
	int x=10;
}
class Shadowing extends Par{
	int x=20;
	
	public void m1() {
		
	}

	public static void main(String[] args) {
		Par p=new Par();
		//Shadowing sh = new Parent();
		Par pa =  new Shadowing();
		Shadowing s =  new Shadowing();
		
		System.out.println("p.x :"+p.x+"|"+"pa.x :"+pa.x+"|"+"s.x :"+s.x);

	}

}
