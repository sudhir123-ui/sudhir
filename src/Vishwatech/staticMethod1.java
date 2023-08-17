package Vishwatech;

public class staticMethod1 {

	public static void main(String[] args) {
		System.out.println("static main method");
		
		regular1();
		regular2();
		staticMethod2.sample();
		
	}	
		public static void regular1() {
		System.out.println("regular1 method started");

		}	

		public static void regular2() {
		System.out.println("regular2 method started successfully" );
		}
}
