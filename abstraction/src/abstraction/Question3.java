package abstraction;//lets assume this package as music 
 interface Playable
{
	void play(); 
	
	
}
//package abstraction.string;
//import abstraction.Playable;
 class Veena implements Playable {
public void play() {
		System.out.println("some");
 }
}
//package abstraction.wind;
//import abstraction.Playable;
 class Saxophone implements Playable{
	public void play() {
		System.out.println("every");
	}
}
//package live;
//import abstraction.string.Veena;
//import abstraction.wind.Saxophone;
//import abstraction.Playable;

public class Question3{
	public static void main(String[] args) {
		Veena v=new Veena();
		Saxophone s=new Saxophone();
		v.play();
		s.play();
		
		Playable p;
		p=v;
		p.play();
		p=s;
		p.play();
		
	}
	
}
