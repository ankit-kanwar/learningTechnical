package ocja.time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JodaTimeFormat {

	public static void main(String[] args) {
		var d = LocalDate.of(2020, 01, 30);
		String date = d.format(DateTimeFormatter.ISO_DATE);
		System.out.printf("date is: %s",date);
		
		var d2 = LocalDateTime.of(2020, 01, 30,23,6,56);
		String date2 = d2.format(DateTimeFormatter.ISO_DATE);
		System.out.printf("\ndate2 is: %s",date2);
		
		var d3 = LocalDateTime.of(2020, 01, 30,23,6,56);
		String date3 = d3.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.printf("\ndate3 is: %s",date3);
		
	
	}

}
