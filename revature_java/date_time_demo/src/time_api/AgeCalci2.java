package time_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalci2 {

	public static void main(String[] args) {
		String s="11-05-1988";
		
		LocalDate curr=LocalDate.now();
		LocalDate dob=LocalDate.parse(s, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		
		
		
		Period p=Period.between(dob, curr);
		int age=p.getYears();
		dob=dob.plusYears(age);
		System.out.println(dob);
		System.out.println("Age = "+age+"years"+ChronoUnit.DAYS.between(dob, curr)+"days");
		

	}

}
