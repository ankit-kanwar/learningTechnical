package ocja;

import java.util.ArrayList;

public class ArrayListError {

	public static void main(String[] args) {
		var a = new ArrayList<String>();
		try {
			while(true) {
				a.add("eat memory");
			}
		}catch(OutOfMemoryError o) {
			System.out.println("Bizarre!!catch block,error handled");
		}
		
		System.out.println("Memory getting cleaned after outofmemory or outormemory handling,creating more objects");
		for(int i=0;i<100;i++) {
			var x = new ArrayListError();
		}
		System.out.println("created more objects");
		
	}
}
