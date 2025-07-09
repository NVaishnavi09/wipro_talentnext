package oops_concepts;

import java.util.Scanner;

public class Oops2 {
  public static String ispalindrome(String s) {
	 // String rev="";
	  String str=s.toLowerCase();
	  String rev=new StringBuilder(str).reverse().toString();
	  return rev;
  }
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	   String input=sc.nextLine();
	   
	   if(ispalindrome(input).equals(input)) {
		   System.out.println("ispalindrome");
  }else {
	   System.out.println("is not palindrome");
  }
}
  }

