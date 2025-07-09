package oops_concepts;

public class Box {
           int h;
           int w;
           int d;
           public Box(int h,int w,int d ) {
        	   this.h=h;
        	   this.w=w;
        	   this.d=d;
        	   
        	   
           }
           public int volume() {
        	  int n=h*w*d;
        	  return n;
           }
           public static void main(String[] args) {
        	   Box volume=new Box(12,14,15);
        	   
        	  System.out.println( volume.volume());
           }
}
