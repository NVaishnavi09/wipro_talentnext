package array_questions;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
		 }
		 int min=i[0];
		 int max=i[1];
		 for(int a=0;a<n;a++) {
			 if(i[a]>max) {
				 max=i[a];
			 }if(i[a]<min) {
				 min=i[a];
			 }
			 
		 }
		 System.out.println(max);
		 System.out.println(min);

	}

}
