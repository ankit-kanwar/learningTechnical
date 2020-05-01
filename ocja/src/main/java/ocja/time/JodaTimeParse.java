package ocja.time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class JodaTimeParse {

	public static void main(String[] args) {
		var d = LocalDate.parse("2020-01-21", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.printf("date is: %s\n\n",d);
		
		var d2 = LocalDateTime.parse("2020-01-21", DateTimeFormatter.ISO_DATE_TIME);
		System.out.printf("\ndate2 is: %s",d2);
		
		
	
	}

}
