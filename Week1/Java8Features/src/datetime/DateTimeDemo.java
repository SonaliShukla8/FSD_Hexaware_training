package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate date1= LocalDate.now();
		System.out.println(date1);
		LocalDate independent = LocalDate.of(1947,8,15);
		System.out.println(independent);
		String str= "1991-06-19";
		LocalDate dob = LocalDate.parse(str);
		System.out.println(dob);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str2="31-12-2023";
		LocalDate date=LocalDate.parse(str2,formatter);
		System.out.println(date);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String date3=date1.format(formatter2);
		
		

	}

}
