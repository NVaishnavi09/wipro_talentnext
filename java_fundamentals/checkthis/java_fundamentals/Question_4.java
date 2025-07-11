package java_fundamentals;

import java.util.Scanner;

public class Question_4 {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     //int n=sc.nextInt();
     System.out.println("enter num");
     int n=sc.nextInt();
     if(n==0) {
    	 System.out.println("zero");
     }if(n>0) {
    	 System.out.println("Positive");
    	 
     }else{
    	 System.out.println("Negative");
     }
     
}
}