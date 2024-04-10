package Core_java;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		//no duplicates valyes,albahbetical 
		//HashMap<key,val
//accepts duplicate keys but not the values
		// TODO Auto-generated method stub
		HashMap<String,Integer> hs=new HashMap();
		hs.put("lidiya",10);
		hs.put("abc",20);
		hs.put("xys",10);
		hs.put("lidiya",10);
		System.out.println(hs);
		for(Map.Entry mentry:hs.entrySet())
		{
			System.out.println("the key are:"   +mentry.getKey() +   "the values are:"  +mentry.getValue());
		}
		

	}

}
