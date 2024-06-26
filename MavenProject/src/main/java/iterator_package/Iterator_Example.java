package iterator_package;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Example {

	public static void main(String[] args) {
		
ArrayList<String> listobj=new ArrayList<String>();

{
		
		listobj.add("Cow");
		listobj.add("mouse");
		listobj.add("Pen");
		listobj.add("Java");
		listobj.add("Ba");
		
		
		System.out.println(listobj);
		
		Iterator<String> obj=listobj.iterator();
		
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}

		obj.remove();
		System.out.println(listobj);
	}

}
}

