package oops_concepts;

import java.util.Scanner;

public class Oops7 {
  public static String starremove(String s) {
	  StringBuilder str=new StringBuilder();
	  for(int i=0;i<s.length()-1;i++) {
		  if((i>0&& s.charAt(i-1)=='*')||(s.charAt(i) == '*')||( i < s.length() - 1 && s.charAt(i + 1) == '*')) {
			  continue;
		  }
		str.append(s.charAt(i));
			  
		  }
	  return str.toString();
	  }
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	   String input=sc.nextLine();
	   System.out.println(starremove(input));
  
  }


}
