package array_questions;

import java.util.Scanner;

public class ArrayQ5 {
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
    		 int n=sc.nextInt();
    		 int [] i=new int[n];
    	//	 int [] m=new int[];
    		 for(int a=0;a<n;a++) {
    			  i[a]=sc.nextInt();	
         }
    		// boolean isduplicate=false;
    		 for(int a=0;a<n;a++) {
    			boolean isduplicate=false;
    			 for(int b=0;b<a;b++) {
    				 if(i[a]==i[b]) {
    					isduplicate=true;
    					 break;
    					 
    					
    					 
    				 }
    			 }
    			 if(!isduplicate) {
    				 System.out.print(i[a]+ " ");
    			 }
    		 }
    		 
         }

}