package oops_concepts;

public class Calculator {
	public static int powerInt(int n1,int n2) {
		return (int)Math.pow(n1, n2);
		
	}
	public static double powerDouble(double n1,int n2) {
		return (double)Math.pow(n1, n2);
	}
	public static void main(String[] args) {
		Calculator  pow1=new Calculator();
		Calculator  pow2=new Calculator();
		System.out.println( pow1.powerInt(12, 2));
		System.out.println( pow2.powerDouble(12.2, 2));
		
	}
}

