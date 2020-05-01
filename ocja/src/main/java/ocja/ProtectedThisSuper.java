package ocja;

import ocjahelper.ParentProtectedVar;

public class ProtectedThisSuper extends ParentProtectedVar{

	public static void main(String[] args) {
		new ProtectedThisSuper().m1();
		
	}

	private void m1() {
		var p = new ParentProtectedVar();
		System.out.println(p.i1);
		//System.out.println(p.i2);
		System.out.println(this.i2);
		System.out.println(super.i2);
		
	}

}
