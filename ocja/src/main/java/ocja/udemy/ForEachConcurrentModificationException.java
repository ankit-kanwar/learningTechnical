package ocja.udemy;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachConcurrentModificationException {

	public static void main(String[] args) {
		var dryFruits = new ArrayList<String>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");
		/*for (String string : dryFruits) {
			if(string.startsWith("A")) {
				dryFruits.remove(string);
			}
		}*/
		
		Iterator itr = dryFruits.listIterator();
		while(itr.hasNext()) {
			if(((String)itr.next()).startsWith("A")) {
				itr.remove();;
			}
		}
		System.out.println(dryFruits);

	}

}
