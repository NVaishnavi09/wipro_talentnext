package abstraction;

class InvalidCountryException extends Exception{
	public InvalidCountryException (String message) {
		super(message);
	}
}
public class Question7 {
 public void RegisterUser(String UserName,String userCountry)throws InvalidCountryException {
	 
		 if(!userCountry.equalsIgnoreCase("india")) {
			 throw new InvalidCountryException ("user outside india");
		 }
		 System.out.println("User registered");
	 }
 
 public static void main(String[] args) {
	 Question7 q=new Question7();
	try {
		
	
	 q.RegisterUser("mini","India");
	 q.RegisterUser("moyi","ua");
 }catch(InvalidCountryException e) {
	 System.out.println("user is not in india and not registered");
 }
}}

