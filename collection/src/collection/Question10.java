package collection;

import java.util.*;
import java.io.*;

public class Question10 {
	   public static void main(String[] args) {
	        
	        TreeSet<String> days = new TreeSet<>();

	        
	        days.add("Sunday");
	        days.add("Monday");
	        days.add("Tuesday");
	        days.add("Wednesday");
	        days.add("Thursday");
	        days.add("Friday");
	        days.add("Saturday");

	       
	        System.out.println("Days of the week (using TreeSet):");
	        for (String day : days) {
	            System.out.println(day);
	        }
	    }
}
