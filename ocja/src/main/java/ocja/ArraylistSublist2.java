package ocja;

import java.util.ArrayList;
import java.util.List;

public class ArraylistSublist2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");
        System.out.println("list before sublisting"+list);
        List<String> subList = list.subList(1, 2); //Line n1
        System.out.println("list after sublisting"+list);
        subList.set(0, "E"); //Line n2
        System.out.println("list after sublisting and modifying sublist"+list);
        System.out.println("list after sublisting and modifying sublist as string:"+String.join("", list));

	}

}
