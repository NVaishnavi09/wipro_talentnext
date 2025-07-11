package array_questions;

import java.util.Scanner;

public class ArrayQ6 {
     public static void main(String[] args) {
    	
        	 Scanner sc=new Scanner(System.in);
    		 int n=sc.nextInt();
    		 int [] i=new int[n];
    		 for(int a=0;a<n;a++) {
    			  i[a]=sc.nextInt();
                 }
    		 
            arrange(i);
    		
    		 
    	for(int a=0;a<n;a++) {
    		System.out.println(i[a]);
    	}
    		 
   }
     public static void arrange(int []arr) {
    	int ev=0;
    	int od=arr.length-1;
    	 while(ev<od) {
    		 if(arr[ev]%2==0) {
    			 ev++;
    		 }else {
    			 if(arr[od]%2!=0) {
    				 od--;
    			 }else {
    		 
    	 
    		 int temp=arr[ev];
    		 arr[ev]=arr[od];
    		 arr[od]=temp;
    		 ev++;
    		 od++;
    			 }
     } 
    	 }

}
}