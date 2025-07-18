package wrapperclass;

public class Question3 implements Cloneable{
	int age;
	String name;
	
	public Question3(int age,String name) {
		this.age=age;
		this.name=name;
		
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public void display() {
		System.out.println( "AGE: "+age +"," +"Name: "+name);
	}
	public static void main(String[] args) {
		try {
			Question3 name1=new Question3(20,"vaish");
			name1.display();
			Question3 name2=(Question3) name1.clone();
			name1.age=21;
			name1.name="vikram";
			
			System.out.println("original: ");
			name1.display();
			System.out.println("cloned: ");
			name2.display();
		}catch(CloneNotSupportedException e) {
			System.out.println("not supported");
		}
	}
}
