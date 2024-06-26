package set;

import java.util.HashSet;
import java.util.Set;

public class Set_Union_Method {

	public static void main(String[] args) {
		
Set<Integer> obj= new HashSet<Integer>();
		
		{
		
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		System.out.println(obj);
		
		
		}
		
		Set<Integer> obj1 = new HashSet<Integer>();
		
		{
		
		   obj1.add(1);
		   obj1.add(2);
		   obj1.add(3);
		   
		   System.out.println(obj1);
			
		}
		
		obj.addAll(obj1);
		System.out.println(obj);

	}

}
