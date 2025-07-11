package array_questions;

import java.util.Scanner;

public class ArrayQ4 {
	 public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
		 }
		// System.out.println("enter the number");
		// int m=sc.nextInt();
		 for(int a=0;a<n;a++) {
         if(i[a]>0&&i[a]<127) {
        	 char c=(char)i[a]; //int n=(int)m;
        	 System.out.print(c);
         }else {
        	 System.out.println("no value");
         }
}
}}