package Core_java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hash set does not take the duplicate values
		HashSet<String> hs=new HashSet();
		hs.add("first");
		hs.add("ls");
		hs.add("ls");
		hs.add("ls");
		hs.add("ad");

		hs.add("ls");
		System.out.println("the value are "+hs);
Iterator itr=hs.iterator() ;
{
System.err.println();
	}

}
}
