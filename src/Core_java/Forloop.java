package Core_java;

public class Forloop {
	public  static void main(String args[]) 
	  {
		int n=5;
		int a=3;
		int i=1;
		for ( i=1;i<=15;++i)
		{
			
		
		if(i%n==0)
		{
			System.out.println("Fizz");
	   }
		
		if(i%a==0)
		{
			System.out.println("Bizz");
		}
		if(i%a!=0)
		System.out.println(i);
		else if(i==n)
		System.out.println();
	}
		
		

}

}