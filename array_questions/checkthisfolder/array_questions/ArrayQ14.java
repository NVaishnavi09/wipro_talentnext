package array_questions;

import java.util.Scanner;

public class ArrayQ14 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] arr=new int[n];
		 for(int a=0;a<n;a++) {
			  arr[a]=sc.nextInt();			 
		 }
		 int sum = 0;
	        boolean skip = false;

		 for(int i=0;i<n;i++) {
			  if (arr[i] == 6) {
	                skip = true;
	                continue;
	            }
	            if (skip) {
	                if (arr[i] == 7) {
	                    skip = false;
	                }
	                continue;
	            }
	            sum += arr[i];
	        }
		  System.out.println(sum); 
			 }
		 }