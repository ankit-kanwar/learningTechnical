package ocja.questions;

import java.time.LocalTime;

public class Test5 {

	public static void main(String[] args) {
		
		var v1 = LocalTime.of(1, 15,30);
		v1.withHour(30);
		System.out.println(v1);
		
	}
}
