package array_questions;

import java.util.Scanner;

public class ArrayQ12 {
           public static void main(String[] args) {
        	   Scanner sc=new Scanner(System.in);
        	   int n=sc.nextInt();
        	   int [] arr=new int[n];
        	   for(int i=0;i<n;i++) {
        		   arr[i]=sc.nextInt();
        	   }
        	   boolean p=true;
        	   for( int i :arr) {
        		//   boolean p=false;
        		   if(i!=1 && i!=4) {
        			   p=false;
        			   break;
        			  // System.out.println("true");
        		   }
        	   
        		 
        		      
        	   }
        	   System.out.print(p);
        	   
           }  }

