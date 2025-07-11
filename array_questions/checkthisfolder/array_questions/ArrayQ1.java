package array_questions;
import java.util.*;

public class ArrayQ1 {


	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] i=new int[n];
		 for(int a=0;a<n;a++) {
			  i[a]=sc.nextInt();			 
		 }
		 //System.out.println(i);
		 
		 int sum=0;
		for(int a=0;a<n;a++) {
			sum=sum+i[a];
			
		}
		System.out.println(sum);
		
        int avg=sum/n;
        System.out.println(avg);
	}
	

}
