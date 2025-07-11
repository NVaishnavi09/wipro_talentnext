package array_questions;

import java.util.*;
public class ArrayQ7 {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	 //  int n=sc.nextInt();
    	   //int m=sc.nextInt();
    	   int [][]arr=new int[2][2];
    	   int [][]temp=new int[2][2];
    	   System.out.println("enter the elements");
    	   for(int i=0;i<2;i++) {
    		   for(int j=0;j<2;j++) {
    			  // System.out.println("enter the elements");
    			   arr[i][j]=sc.nextInt();
    		   }
    	   }
    	   for(int i=0;i<2;i++) {
    		   for(int j=0;j<2;j++) {
    			   temp[j][i]= arr[i][j];
    		   }
    	   }
    	   
    	   for(int i=0;i<2;i++) {
    		   for(int j=0;j<2;j++) {
    			   System.out.println(temp[i][j]);
    		   }
    	   }
       }
}
