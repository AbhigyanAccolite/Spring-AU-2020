package DateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DaterAndTimer { 
		  
    public static void findDaysInDifferentTimeZone() {
    		LocalDateTime ldt = LocalDateTime.now();
    		ZonedDateTime now = ldt.atZone(ZoneId.of("America/Montreal"));
    		ZonedDateTime secondDate = now.withZoneSameInstant(ZoneId.of("Asia/Singapore")).minusDays(11111);
         
    		long diff = ChronoUnit.DAYS.between(secondDate, now);
         
        	System.out.println("Difference is:" + diff);
         
    } 
  
     
    public static void findDurationBetweenTwoDatesInNano() {  	
	    LocalDateTime date2= LocalDateTime.of(1998, 7, 4, 0, 0);
	    LocalDateTime date1= LocalDateTime.now();
        long gap = java.time.Duration.between(date2, date1).getNano(); 
        System.out.println("duraion gap between time1" + " & time2 is " + gap); 
    } 
  
     
    public static void main(String[] args)  
    { 
        findDaysInDifferentTimeZone(); 
        findDurationBetweenTwoDatesInNano(); 
    } 
} 

