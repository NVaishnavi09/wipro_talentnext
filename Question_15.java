package java_fundamentals;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a=n;
	  int rev=0;
	  while(n!=0) {
		  int r=n%10;
		  rev=rev*10+r;
		  n=n/10;
	  }
	  if(a==rev) {
		  System.out.println( a + " is Palindrome ");
	  }else {
		  System.out.println(a + " is not palindrome");
	  }

	}

}
