package array_questions;

import java.util.Scanner;

public class ArrayQ10 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("size of array");
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 System.out.println(" elements?");
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
		 }
		 if(n<2) {
			 System.out.println("provide more numbers");
			 
		 }
		 for(int a=0;a<n;a++) {
			 for(int b=0;b<a;b++) {
				 if(i[a]<i[b]) {
					 int temp=i[a];
					 i[a]=i[b];
					 i[b]=temp;
				 }
				 
			 }
		 }
		 System.out.println("minimum elements are "+ i[0] +","+ i[1]);
		 System.out.println("maximum elements are "+ i[n-1] +","+ i[n-2]);
}
}
