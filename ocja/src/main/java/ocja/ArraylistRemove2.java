package ocja;

import java.util.ArrayList;
import java.util.List;

public class ArraylistRemove2 {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();
		places.add("Austin");
		places.add("Okinawa");
		places.add("Giza");
		
		places.remove(Integer.valueOf(2));
		
		System.out.println(places);

	}

}
