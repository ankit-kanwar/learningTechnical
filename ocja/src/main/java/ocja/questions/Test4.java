package ocja.questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test4 {

	public static void main(String[] args) {
		
		var v1 = LocalDate.of(2019, 1, 1);
		var v2 = LocalDate.parse("2019-1-1",DateTimeFormatter.ISO_DATE);
		var v3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);
		
	}

}
