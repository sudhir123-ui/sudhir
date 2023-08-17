package Vishwatech;

public class Parameters {

	public static void para1(String name,int age) {
		
		System.out.println(name+"and"+age);
	}
	public static void main(String[] args) {
		para1("ravikant"+" ",+99);
		
		para1("sudhir"+" ",20);
		
		String s1 = new String ("sunil");
		String s2 = "sunil";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	}

 
