package java_fundamentals;

public class Question_1 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("enter 2 arguments");
			return;
		}
	  String company=args[0];
	  String loc=args[1];
	  System.out.println(company + " Technologies " + loc);
		}

	}


