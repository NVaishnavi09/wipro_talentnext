package java_fundamentals;

public class Question_2 {
public static void main(String[] args) {
	if(args.length<1) {
		System.out.println("enter argument");
	}
	String msg=args[0];
	System.out.println("Welcome "+ msg);
}
}
