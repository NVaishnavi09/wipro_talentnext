package collection;

import java.util.*;

public class Question1 {
       public static void main(String[] args) {
    	   ArrayList<String> ls=new ArrayList<>();
    	   Scanner sc=new Scanner(System.in);
    	   for(int i=0;i<=12;i++) {
    		   System.out.println("enter month: ");
    		   String s=sc.nextLine();
    		   ls.add(s);
    	   }
    	   System.out.println(ls);
       }
}
