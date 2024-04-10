package Core_java;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("null");
		v.add(null);
		System.out.println("the values are"+v);
		Iterator itr=v.iterator() ;
		while(itr.hasNext())
		{
		
		System.out.println(itr.next());
		

	}

}
}
