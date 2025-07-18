package abstraction;

interface Test{
	abstract int myFunction(int a,int b,int c);
	
}
public class Question4 {
             public static void main(String[] args) {
            	 Test f1=(a,b,c)->a+b+c;
            	 System.out.println(f1.myFunction(9, 6, 9));
            	 Test f2=(a,b,c)->a*b*c;
            	 System.out.println(f2.myFunction(8,6,3));
            	
            			 
             }
}
