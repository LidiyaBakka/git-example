package Core_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist 
{
	public static void main(String args[])
	
	{
		
		ArrayList arr =new ArrayList();
		arr.add("Hello");
		arr.add("lidiya");
		System.out.println(arr);
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
		System.out.println("the values are  :"+itr.next());
	}
	

}
}
