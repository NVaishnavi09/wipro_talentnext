package oops_concepts;

class Animal2 {
       void eat() {
    	   System.out.println("eat");
       }
       void sleep() {
    	   System.out.println("sleep");
       }
}
class Bird extends Animal2{
	void fly() {
		System.out.println("i can fly");
	}
	
}
public class Animal{
	public static void main(String []args) {
		Bird ob=new Bird();
		
		ob.eat();
		ob.sleep();
		ob.fly();
	}
}