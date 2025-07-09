package oops_concepts;

import java.util.Scanner;

public class Oops4 {
    public static String repeatString(String s,int n) {
    	//int n=s.length();
    	s=s.substring(n-1,s.length());
    	String str=s.repeat(n);
    	return str;
    }
    public static void main(String[] args) {
  	  Scanner sc=new Scanner(System.in);
 	   String input=sc.nextLine();
 	  int N=sc.nextInt();
 	   System.out.println(repeatString(input,N));
    }
}
