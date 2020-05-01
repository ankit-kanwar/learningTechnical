package ocja.udemy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethod {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add(0,'E');
		list.add('X');
		list.add(1,'P');
		list.add(3,'0');
		
		if(list.contains('0')) {
			list.remove('0');
		}
		
		for (Character character : list) {
			System.out.println(character);
		}

	}

}
