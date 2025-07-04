package java_fundamentals;

import java.util.Scanner;

public class Question_5 {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter two numbers");
    	  int n=sc.nextInt();
    	  int m=sc.nextInt();
    	  boolean result=n%10==m%10;
    	  if(result==true) {
    		  System.out.println("true");
    	  }else {
    		  System.out.println("false");
    	  }
      }
}
