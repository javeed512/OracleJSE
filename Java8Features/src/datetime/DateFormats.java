package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormats {

	public static void main(String[] args) {


		LocalDateTime  date =	LocalDateTime.now();
		
				System.out.println(date);
		
	DateTimeFormatter formatter =	DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");		
		
			String  mydate =	date.format(formatter);
			
			System.out.println(mydate);
		
		
	}

}
