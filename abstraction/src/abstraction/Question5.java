package abstraction;
import java.util.*;

public class Question5 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   
	   int[] arr=new int[n];

	   for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	   }
	   System.out.println("enter the index");
	   int m=sc.nextInt();
	   try {
	   for(int i=0;i<n;i++) {
		   if(i==m) {
			   System.out.print(arr[i]);
		   }
	   }
	   
   }catch(Exception e) {
	   System.out.println(e);
   }
	   sc.close();
}
}
