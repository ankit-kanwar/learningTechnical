package ocjahelper;
import ocja.Protected2;

class Middle extends Protected2{
	
}

public class ProtectedConcept2 extends Middle{

	public static void main(String[] args) {
		Protected2 p2 = new Protected2();
		//p2.m1();
		
		Middle m = new Middle();
		//m.m1();
		
		Protected2 p21 = new Middle();
		//p21.m1();
		
		Protected2 p22 = new ProtectedConcept2();
		//p22.m1();
		
		Middle m2 = new ProtectedConcept2();
		//m2.m1();
		
		ProtectedConcept2 pc = new ProtectedConcept2();
		pc.m1();
	}
}
