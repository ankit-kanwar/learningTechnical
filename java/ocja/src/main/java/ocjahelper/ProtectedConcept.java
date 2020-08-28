package ocjahelper;

import ocja.Protected2;

public class ProtectedConcept extends Protected2{

	public static void main(String[] args) {
		Protected2 p2 = new Protected2();
		//p2.m1();
		
		ProtectedConcept pc = new ProtectedConcept();
		pc.m1();
		
		Protected2 p21 = new ProtectedConcept();
		//p21.m1();
	}

}
