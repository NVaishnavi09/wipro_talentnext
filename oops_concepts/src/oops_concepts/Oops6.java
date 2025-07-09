package oops_concepts;

import java.util.Scanner;

public class Oops6 {
           public static String printthing(String s, String d) {
        	   int n=s.length();
        	  String str="";
        	   int m=d.length();
        	   if(n>m) {
        		    str=d.concat(s).concat(d);
        	   }if(m>n) {
        		    str=s.concat(d).concat(s);
        	   }
        	   return str;
           }public static void main(String[] args) {
        		  Scanner sc=new Scanner(System.in);
        		   String input=sc.nextLine();
        		   String input1=sc.nextLine();
                 System.out.println(printthing(input,input1));
           
}
}