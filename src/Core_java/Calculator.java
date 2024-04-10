package Core_java;

 class Addition { 
	 
	public int add( int n1, int n2)
	{ 
		
		if(n2!=0&& n1!=0)
		{
		int result=n1+n2;
		return result;
		
		} else 
			return 0;
	}// method overloading having same method name but  differnt number of parameters it can be different type of parameters
	public int add( int n1, int n2,int n3)
	{ 
		 int result=n1+n2+n3;
		return result;
		
	}
    
	public String  getmepen( int cost)
	{
		if(cost==0)
		{
		System.out.println("pen cost is:"  +cost );
		return " pen";
		} else 
			return "nothing";
	}
} 
public  class Calculator
{
public static void main(String args[])
{
	 int num1=0;
	 int num2=0; 
	 Addition a=new Addition();
	    int result= a.add(num1, num2);
	// int add=num1+num2;
	//Calculator cal=new Calculator();
	  // int res=cal.add( num1,num2);
	   //System.out.println(res);
	//System.out.println("Adding number:"+add );
	 System.out.println("Adding numbers:"+result);
	String cost= a.getmepen( 10);
	System.out.println(cost);
	 
}
}
