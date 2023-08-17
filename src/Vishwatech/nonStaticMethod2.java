package Vishwatech;

public class nonStaticMethod2 {

	public static void main(String[] args) {
		
		System.out.println("This is my main method");
		
		nonStaticMethod2 r3=new nonStaticMethod2();
		r3.nregular3();
	}
	public void nregular3() {
		System.out.println("This is my third non static method from other class");
	
	}
}
