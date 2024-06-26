package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_AddALL_Method {

	public static void main(String[] args) {
		
ArrayList<String> listobj=new ArrayList<String>();
		
		listobj.add("Cow");
		listobj.add("mouse");
		listobj.add("Pen");
		
		
		System.out.println(listobj);
		
		
		ArrayList<String> listobj1=new ArrayList<String>();
		listobj1.add("Java");
		listobj1.add("Ba");
		
		listobj.addAll(listobj1);
		System.out.println(listobj);
	}

}
