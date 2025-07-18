package abstraction;

import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
public class Question6 {
	 public static void validateMark(int mark) throws InvalidMarksException {
	        if (mark < 0) {
	            throw new InvalidMarksException("Marks cannot be negative.");
	        } else if (mark > 100) {
	            throw new InvalidMarksException("Marks cannot be greater than 100.");
	        }
	    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	try {
    	System.out.println("name 1");
    	String st1=sc.nextLine();
    	System.out.println("name 2");
    	String st2=sc.nextLine();
    	System.out.println("enter marks of " +st1);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	validateMark(a);
    	validateMark(b);
    	validateMark(c);
    	int avg=(a+b+c)/3;
    	
    	
    	System.out.println("enter marks of " +st2);
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	int z=sc.nextInt();
    	validateMark(x);
    	validateMark(y);
    	validateMark(z);
    	
    	int avg2=(x+y+z)/3;
    	
    	System.out.println(avg);
    	System.out.println(avg2);
    	}
    	catch(Exception e) {
    		System.out.println("please check the details");
    		
    	}
    sc.close();
    }
    
}
