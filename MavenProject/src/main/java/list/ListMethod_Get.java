package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod_Get {

	public static void main(String[] args) {
		
List<String> obj=new ArrayList<>();
{
		obj.add("Cow");
		obj.add("mouse");
		obj.add("Pen");
		
		
		System.out.println(obj);
		
		String a=obj.get(2);
		System.out.println(a);
	}
}

}
