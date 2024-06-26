package set;

import java.util.HashSet;
import java.util.Set;

public class Set_Add_Method {

	public static void main(String[] args) {
		
		Set<String> obj= new HashSet<String>();
		
		{
		
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("D1");
		System.out.println(obj);
		
		
		}
	}

}
