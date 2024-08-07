package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_test {
	
	public static void main(String[] args) {
	ArrayList<Integer> listobj=new ArrayList<Integer>();

	{
			
			listobj.add(1);
			listobj.add(2);
			listobj.add(3);
			listobj.add(4);
			listobj.add(5);
			
			
			System.out.println(listobj);
			
			Iterator<Integer> obj=listobj.iterator();
			
			while(obj.hasNext())
			{
				System.out.println(obj.next());
			}

		}

}
}
