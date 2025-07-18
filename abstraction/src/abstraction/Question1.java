package abstraction;


import java.util.*;  
import java.util.function.Supplier;

	abstract class Compartment {
	    public abstract String notice();
	}

	
	class FirstClass extends Compartment {
	    public String notice() {
	        return "First Class Compartment";
	    }
	}

	class Ladies extends Compartment {
	    public String notice() {
	        return "Ladies Compartment";
	    }
	}

	class General extends Compartment {
	    public String notice() {
	        return "General Compartment";
	    }
	}

	class Luggage extends Compartment {
	    public String notice() {
	        return "Luggage Compartment";
	    }
	}

	
	

	public class Question1{
	    public static void main(String[] args) {
	     
	        Map<Integer, Supplier<Compartment>> compartmentMap = new HashMap<>();
	        
	        compartmentMap.put(1, FirstClass::new);
	        compartmentMap.put(2, Ladies::new);
	        compartmentMap.put(3, General::new);
	        compartmentMap.put(4, Luggage::new);
	     

	      
	        Compartment[] compartments = new Compartment[4];
	        Random rand = new Random();

	        for (int i = 0; i < compartments.length; i++) {
	            int key = rand.nextInt(compartmentMap.size()) + 1; 
	            compartments[i] = compartmentMap.get(key).get();   
	        }

	     
	        for (int i = 0; i < compartments.length; i++) {
	            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
	        }
	    }
	}

