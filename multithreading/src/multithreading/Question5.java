package multithreading;

import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Thread min=new Thread(()->{
		System.out.println("enter name: ");
	      String s=sc.next();
	      System.out.println("name: "+ s);
	});
	min.setPriority(Thread.MIN_PRIORITY);
	
	Thread max=new Thread(()->{
		System.out.println(" name: ");
	      String x=sc.next();
	      System.out.println("name: "+ x);
	});
	max.setPriority(Thread.MAX_PRIORITY);
	
	Thread norm=new Thread(()->{
		System.out.println(" enenter: ");
	      String h=sc.next();
	      System.out.println("name: "+ h);
	});
	norm.setPriority(Thread.NORM_PRIORITY);
	min.start();
	max.start();
	norm.start();
}
}
