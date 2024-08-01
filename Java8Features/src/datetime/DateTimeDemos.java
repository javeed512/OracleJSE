package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemos {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();

		LocalTime time = LocalTime.now();

		System.out.println(time.getHour());

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(dateTime);

		LocalDate date2 = LocalDate.of(1947, 8, 15);

		System.out.println(date1);
		System.out.println(date2);

		System.out.println("Day of year " + date1.getDayOfYear());
		System.out.println("Year " + date1.getYear());
		System.out.println("Day " + date1.getDayOfWeek());

		System.out.println("Next month " + date1.plusMonths(1));

		System.out.println("Next year " + date1.plusYears(1));

		System.out.println("Previous year " + date1.minusYears(1));

		System.out.println("Is leap year " + date1.isLeapYear());

		System.out.println(date1.isAfter(date2));

		System.out.println(date1.isBefore(date2));

	}

}
