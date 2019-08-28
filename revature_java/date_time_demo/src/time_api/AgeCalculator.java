package time_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {

	public static void main(String[] args) {
	String s="10.12.1999";
	LocalDate curr=LocalDate.now();
	System.out.println("current date "+curr);
	LocalDate dob=LocalDate.parse(s, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	System.out.println("Dob "+dob);
	
	Period period=Period.between(dob, curr);
	System.out.println("Age - "+period.getYears());
	
	System.out.println("You are "+period.getYears()+"years "+period.getMonths()+"month/s "+period.getDays()+"day/s young");
	
	//curr=curr.plusYears(5);
	//System.out.println(curr);
	
	System.out.println(ChronoUnit.MONTHS.between(dob, curr));
	
	
	
	//LocalTime, LocalDateTime
	
	
	}

}
