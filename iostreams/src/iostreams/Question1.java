package iostreams;

import java.util.Scanner;

public class Question1 {
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in) ;
        		 String s=sc.nextLine();
        		 System.out.println("enter the letter :");
        	char d=sc.next().charAt(0);
        		 int count=0;
        		 for(int i=0;i<s.length();i++) {
        			 char c=s.charAt(i);
        			 if(c==d) {
        				 count++;
        			 }
        	 }
        		System.out.println(count);
         }
}
