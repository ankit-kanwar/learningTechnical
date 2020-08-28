package ocja.time;
import java.time.*;

public class JodaTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		//System.out.println(date);
		System.out.println(date.toEpochSecond(LocalTime.now(), ZoneOffset.of("+05:30")));
		
		LocalTime time = LocalTime.now();

		//System.out.println(time);
	}

}
