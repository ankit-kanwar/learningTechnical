package ocja;

import java.util.Iterator;
import java.util.List;


public class Iterator1 {

	public static void main(String[] args) {
		 List<Integer> l = List.of(10,20,20);
		 Iterator itr = l.iterator();
		 while( itr.hasNext())
			 System.out.println(itr.next());
		 
		 for(Iterator itr1=l.iterator();itr1.hasNext();) 
			 System.out.print(itr1.next());
		 

	}

}
