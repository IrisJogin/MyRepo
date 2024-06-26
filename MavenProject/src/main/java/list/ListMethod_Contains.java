package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod_Contains {

	public static void main(String[] args) {
		
		 List<String> obj=new ArrayList<>();
			
			obj.add("Cow");
			obj.add("mouse");
			obj.add("Pen");
			
			
			System.out.println(obj);
			
			boolean a=obj.contains("Cow");
			System.out.print(a);
			

	}

}
