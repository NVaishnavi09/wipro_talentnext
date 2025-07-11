package java_fundamentals;

public class Question_14 {
          public static void main(String[] args) {
        	  if(args.length<0) {
        		  System.out.println("No Value");
        	  }
        	//String m=args[i];
        	  for(int  i=0;i<args.length;i++) {
        	
        		 if(i!=args.length-1) {
        			 System.out.print(args[i]+ ",");
        			 
        		 }else {
        			 System.out.print(args[i]);
        		 }
        	  }
          }
}
