package array_questions;

import java.util.Scanner;

public class ArrayQ13 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
    	 int temp[]=new int[2];
		 int [] arr1=new int[3];
		 System.out.print("enter arr1");
		 for(int a=0;a<3;a++) {
			  arr1[a]=sc.nextInt();	
     }
		// int m=sc.nextInt();
		 int []arr2 =new int[3];
		 System.out.print("enter arr2");
		 for(int a=0;a<3;a++) {
			  arr2[a]=sc.nextInt();	
     } 
		 temp[0]=arr1[1];
		 temp[1]=arr2[1];
		 
	for(int a=0;a<2;a++) {
		System.out.print(temp[a]);
	}
     }
}
