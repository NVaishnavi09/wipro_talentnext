package array_questions;

import java.util.Scanner;

public class ArrayQ11 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("size of array");
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 System.out.println(" elements?");
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
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
 System.out.println("sorted array");
 for(int a:i) {
 System.out.println(a+" ");
}
}
}