package abstraction;

class Invalidage extends Exception{
	public Invalidage (String message) {
		super(message);
	}
}
public class Question8 {
       public static void main(String[] args)throws Invalidage {
    	   try {
    	   if(args.length<2) {
    		   System.out.println("enter both name and age");
    		   return;
    		   
    	   }
    	   String name=args[0];
    	   int age=Integer.parseInt(args[1]);
    	   if(age>=18 && age<60) {
    		   throw new Invalidage("no proper age");
    	   }
    	   System.out.println("User " + name + " is registered successfully with age " + age);
    	   }catch(Invalidage e) {
    		   System.out.println("Age must be a valid number.");
    	   }
       }
}
