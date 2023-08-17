package ArrayAndCollection;

import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) {
		
		ArrayList<Object> ar=new ArrayList<Object>();
		
		//add method
		ar.add(10);            //index-0
		ar.add("vishwatech");  //index-1
		ar.add("12.3");         // index-2
		ar.add('M');             //index-3
		ar.add(null);            //index 4
		
		System.out.println(ar);  // for print
		System.out.println("The size of array is :"+ar.size());  //find size of method
		System.out.println("LI=" +0);
		System.out.println("HI="+(ar.size()-1));
		
		//get()Mathod: To find out Element at indexposition
		System.out.println(ar.get(2));
		System.out.println("The size of array is :"+ar.size());
		
		
		

	}

}
