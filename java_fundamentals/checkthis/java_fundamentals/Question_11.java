package java_fundamentals;

import java.util.Scanner;

public class Question_11 {
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
        	 int c=sc.nextInt();
        	 int sum=0;
        	 while(c!=0) {
        	 int r=c%10;
        	 sum=sum+r;
        	  c=c/10;
    
        	 }
        	 
         
        	 System.out.println(sum);
}
}