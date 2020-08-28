package ocja.time;
import java.time.*;

public class JodaTime3 {

	public static void main(String[] args) {
		var d = LocalDate.now();
		var b = LocalDate.of(1992, 12, 10);
		Period p = Period.between(b, d);
		System.out.printf("Your age is %d years %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
	
	}

}
