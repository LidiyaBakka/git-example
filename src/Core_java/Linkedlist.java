package Core_java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		//it will accept duplicate values
		
		
		LinkedList ls=new LinkedList();
		
		ls.add("a");
	ls.add("lamb");
		ls.add("a");
		ls.add("c");
		ls.add("d");
		ls.add(1, "b");
		System.out.println(ls);
		Iterator itr=ls.iterator();
		while(itr.hasNext())
		{
		
      System.out.println("the values are "+itr.next());
	}

}
}
