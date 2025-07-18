package collection;
import java.io.*;
import java.util.*;
public class Question3 {
	  public static void printAll(ArrayList<String> list) {
	        Iterator<String> iterator = list.iterator();
	        System.out.println("Elements in the ArrayList:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

	    public static void main(String[] args) {
	        
	        ArrayList<String> stringList = new ArrayList<>();

	        
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");
	        stringList.add("Date");

	        
	        printAll(stringList);
	    }
	}

