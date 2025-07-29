package collection;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Question25 {
	 public static void main(String[] args) {
	        LocalTime currentTime = LocalTime.now();
	        LocalTime timeBefore = currentTime.minusHours(5).minusMinutes(30);

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	        System.out.println("Current Time         : " + currentTime.format(formatter));
	        System.out.println("Time before 5h 30min : " + timeBefore.format(formatter));
	    }
	}
