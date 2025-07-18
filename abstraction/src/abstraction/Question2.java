package abstraction;

abstract class Vehicle{
	public abstract String getModelName();
	public abstract  String getRegistrationNumber();
	public abstract String getOwnerName();
}
//package abstraction.twowheelrs;
//import abstraction;
  class Hero extends Vehicle{
	 public  String getModelName() {
		 return "hero";
	 }
		public  String getRegistrationNumber() {
			return "48utirj";
		}
		public String getOwnerName() {
			return "heii";
		}
	public int getSpeed() {
		return 90;
	}
	public void radio() {
		System.out.println("radio is on");
	}
}
 class Honda extends Vehicle {
	public String getModelName() {
		return "honda";
	}
	public String getRegistrationNumber() {
		return "o4r3409";
	}
	public String getOwnerName() {
		return "raju";
	}
    public int getSpeed(int speed) {
    	return 100;
    }
    public void cdplayer() {
    	System.out.println("cd is also on");
    }
}

public class Question2{
	public static void main(String[] args) {
		Hero hero=new  Hero();
		System.out.println("model : " + hero.getModelName());
		System.out.println("number : " + hero.getRegistrationNumber());
		System.out.println("Owner : " + hero.getOwnerName());
		System.out.println("speed : " + hero.getSpeed());
		hero.radio();
		System.out.println();
	}
}