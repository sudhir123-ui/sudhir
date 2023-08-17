package Vishwatech;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b= 40;
		
		System.out.println(a>b && b<a);
		System.out.println(a>b && b>a);
		
		System.out.println(a>b || b>a);
		
		System.out.println(!(a>b || b>a));
		

	}

}
