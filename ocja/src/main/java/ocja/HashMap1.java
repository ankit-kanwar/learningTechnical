package ocja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap1 {
	
	
	
	public static void main(String[] args) {
		 Map<String,String> map = new HashMap<String,String>();
		 List<String> keys = new ArrayList<>(List.of("AA","BB","CC","DD"));
		 String[] values = {"Apple","Banana","Cat","Dog"};
		
			for(var i=0;i<keys.size();i++) {
				map.put(keys.get(i), values[i]);
			
		}
		keys.clear();
		values=new String[0];
		System.out.printf("map size is:%s and list size is %s and array size is %s",map.size(),keys.size(),values.length);

	}

}
