package list;

import java.util.ArrayList;
import java.util.List;

public class RemoveList_Ex {

	public static void main(String[] args) {
		
    List<String> obj=new ArrayList<>();
		
		obj.add("Cow");
		obj.add("mouse");
		obj.add("Pen");
		
		
		System.out.println(obj);
		
		obj.remove("Cow");
		System.out.println(obj);
		
		obj.remove(1);
		System.out.println(obj);
		

	}

}
