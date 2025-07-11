package array_questions;

import java.util.Scanner;

public class ArrayQ3 {
	public static int find(int m,int[] i) {
		
		 for(int a=0;a<i.length;a++) {
			 if(m==i[a]) {
				 return a;
			 }
		 }
		 return -1;
			
			 
	}
	
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
		 }
		 System.out.println("enter the number");
		 int m=sc.nextInt();

		int f=find(m,i);
			 
		 if(f==-1) {
			 System.out.println("-1");
		 }
		 else {
			 System.out.println(f);
		 }
		 
     } 

}