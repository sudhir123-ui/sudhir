package ArrayAndCollection;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[ ] ={"Ravikant", "10","Abc@gmail.com","M","Ravikant","10"};
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if (s[i]==s[j]) {
					System.out.println("This value is duplicate "+s[i]);
				}
			}
		}
			/*ArrayList l = new ArrayList();
			List<String>p= new ArrayList<String>();
			p.add("sunil");
			p.add("sunil");
			p.add("sunil");
			System.out.println(p);*/
	}

}
