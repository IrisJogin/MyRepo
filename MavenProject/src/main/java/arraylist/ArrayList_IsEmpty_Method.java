package arraylist;

import java.util.ArrayList;

public class ArrayList_IsEmpty_Method {

	public static void main(String[] args) {
		
ArrayList<String> listobj=new ArrayList<String>();

{
		
		listobj.add("Cow");
		listobj.add("mouse");
		listobj.add("Pen");
		listobj.add("Java");
		listobj.add("Ba");
		
		
		System.out.println(listobj.get(4));
		
		boolean a=listobj.isEmpty();
	    System.out.println(a);
	}
		

	}

}
