package ocja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterator3 {

	public static void main(String[] args) {
		 List<Integer> l = List.of(10,20,20);
		 {
		  Iterator itr = l.iterator();
		  System.out.println(itr.getClass().getName());
		 }
		 
		 var l1 =  new ArrayList<Integer>();
		 Iterator itr2 = l1.iterator();
		 System.out.println(itr2.getClass().getName());
		 
		 
		 
	}
}
