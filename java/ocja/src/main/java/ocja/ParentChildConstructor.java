package ocja;

class P51{
	int i=10;
	P51(int i){
		super();
		this.i=i;
	}
}

class C51 extends P51{
	int j=10;
	
	C51(int j){
		super(0);
		this.j=j;
	}
	
	C51(int i,int j){
		super(i);
		//this(j);
	}
}
public class ParentChildConstructor {

	public static void main(String[] args) {
		C51 child = new C51(1000,2000);
		System.out.println(child.i+":"+child.j);

	}

}
