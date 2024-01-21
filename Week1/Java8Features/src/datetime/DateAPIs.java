package datetime;

import java.time.LocalDate;

public class DateAPIs {
 public static void main(String args[]) {
	 LocalDate date1= LocalDate.now();
	 LocalDate date2= LocalDate.of(2023,12,31);
	 System.out.println(date1.isLeapYear());
	 System.out.println(date1.isBefore(date2));
	 System.out.println(date2.plusMonths(2));
	 System.out.println(date2.plusYears(2));
	 System.out.println(date2.minusYears(2));
 }
}
