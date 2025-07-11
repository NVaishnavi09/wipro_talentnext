package array_questions;

import java.util.Scanner;

public class ArrayQ9 {
	 public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 //  int n=sc.nextInt();
    	   //int m=sc.nextInt();
    	   int [][]arr=new int[3][3];
    	  // int []flat=new int[4];
    	 //  int k=0;
    	   System.out.println("enter the elements");
    	   for(int i=0;i<3;i++) {
    		   for(int j=0;j<3;j++) {
    			  
    			   arr[i][j]=sc.nextInt();
}
}
    	   
    	   int max=arr[0][0];
    	   for(int i=0;i<3;i++) {
    		   for(int j=0;j<3;j++) {
    			   if(arr[i][j]>max) {
    				   max=arr[i][j];
    			   }
    		   }
    	   }
    	   System.out.println(max);
	 }
}