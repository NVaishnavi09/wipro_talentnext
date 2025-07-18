package collection;

import java.util.*;
import java.io.*;

public class Question8 {
	 public static void main(String[] args) {
	        
	        HashSet<String> employeeNames = new HashSet<>();

	      
	        employeeNames.add("V");
	        employeeNames.add("P");
	        employeeNames.add("S");
	        employeeNames.add("P");
	        employeeNames.add("R");

	        
	        System.out.println("Employee Names (using Iterator):");
	        Iterator<String> it = employeeNames.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
}
