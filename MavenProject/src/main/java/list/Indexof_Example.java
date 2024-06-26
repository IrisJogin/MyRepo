package list;

import java.util.ArrayList;
import java.util.List;

public class Indexof_Example {

	public static void main(String[] args) {
		
      List <Integer> obj=new ArrayList<Integer>();
      {
      
        obj.add(10);
        obj.add(34);
        obj.add(11);
        obj.add(10);
        obj.add(11);
        
        System.out.println(obj);
        
        int firstoccurance=obj.indexOf(10);
        System.out.println(firstoccurance);
        int lastoccurance=obj.lastIndexOf(10);
        System.out.println(lastoccurance);
      
	}

}
}
