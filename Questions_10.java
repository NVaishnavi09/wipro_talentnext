package java_fundamentals;

import java.util.Scanner;

public class Questions_10 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int count=0;
    	 for(int i=2;i<n;i++) {
    		 if(n%i==0) {
    			 count=count+1;
    		 }
    	 }if(count>1) {
    			 System.out.println("prime");
    		 }else {
    			 System.out.println("not prime");
    		 }
    	 }
     }

