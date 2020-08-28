package ocja;

import java.util.ArrayList;
import java.util.List;

public class LambdaLocalVariable {

	public static void main(String[] args) {
		Integer i = 10;
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(i *= 2);
        list.add(i);
 
        //list.removeIf(i -> i == 10);
 
        System.out.println(list);

	}

}
