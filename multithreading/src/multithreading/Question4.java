package multithreading;

public class Question4 {
 public static void main(String[] args) {
	 Thread t1=new Thread(() ->{
		 for(int i=0;i<=20;i++) {
			 if(i%2==0) {
				 System.out.println(i);
				 try {
					 Thread.sleep(500);
					 
				 }catch(InterruptedException e) {
					 System.out.println("exception");
				 }
			 }
		 }
	 });
	 Thread t2=new Thread(()->{
		 for(int i=0;i<=20;i++) {
			 if(i%2!=0) {
				 System.out.println(i);
				 try {
					 Thread.sleep(500);
					 
				 }catch(InterruptedException e) {
					 System.out.println("exception");
				 }
			 }
		 }
	 });
	 t1.start();
	 try {
		 t1.join();
	 }catch(InterruptedException e) {
		 System.out.println("exception");
	 }
	 t2.start();
 }
}
