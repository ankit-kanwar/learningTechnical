package ocja;

import ocjahelper.ParentProtectedVar;

public class ProtectedObj extends ParentProtectedVar{

	public static void main(String[] args) {
		
		var ppv = new ParentProtectedVar();
		System.out.println(ppv.i1);
		
		var po = new ProtectedObj();
		System.out.println(po.i2);
		
		ParentProtectedVar ppv2 = new ProtectedObj();
		//System.out.println(ppv2.i2);

		Object obj = new ProtectedObj();
		
	}

}
