package Core_java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet ls1=new LinkedHashSet();
		//no duplicates,albhabetical order,
		ls1.add("ls1");
		ls1.add("first");
		ls1.add("second");
		ls1.add("third");
		ls1.add("ls1");
		System.out.println(ls1);
		Iterator itr=ls1.iterator();
		while(itr.hasNext())
		{
		
      System.out.println("the values are "+itr.next());
	}
	}

}
