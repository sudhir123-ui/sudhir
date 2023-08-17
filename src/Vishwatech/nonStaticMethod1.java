package Vishwatech;

public class nonStaticMethod1 {
	
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		
		nonStaticMethod1 r1=new nonStaticMethod1();
		r1.nregular1();
		
		
		nonStaticMethod1 r2=new nonStaticMethod1();
		r2.nregular2();
		
		nonStaticMethod2 r3=new nonStaticMethod2();
		r3.nregular3();
	}
  public void nregular1() {
	  System.out.println("This is my first non ststic method");

	}
  public void nregular2() {
	  System.out.println("This is my second non ststic method");
  }
  
}
