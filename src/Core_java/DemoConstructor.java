package Core_java;

public class DemoConstructor

 {
	String Name;
	int Id;
	DemoConstructor()
	{
		System.out.println("Default constructor");
	}
	DemoConstructor(String name,int id)
	{
		this.Name=name;
		this.Id=id;
	}
	DemoConstructor(long id)
	{
		System.out.println("one argument:"+id);
	}

public static void main(String args[])

{
	DemoConstructor demo=new DemoConstructor();
	DemoConstructor demo1=new DemoConstructor("lidiya", 122);
	
	System.out.println("Name:" +demo1.Name +"ID:"+demo1.Id);
	DemoConstructor demo2=new DemoConstructor(76768);
	
	
	
}
}
