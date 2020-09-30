
public class Methods {

	public String Sum()
	{
		int a =5;
		int b =5;
		int sum=a+b;
		
		System.out.println("sum is" + sum);
		return "Pass";
		
	}
	
	public void Test()
	
	{
		String txt="Hello World";
		System.out.println(txt.indexOf("o"));
		System.out.println(txt.substring(6));
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		System.out.println("Lenght of string is "+ txt.length());
		
	}
	
	public void Reverse()
	{
		String str="madam";
		String t="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			//str.charAt(i);
			t=t+str.charAt(i);
			
		}
		System.out.println(t);
		
		if(str==t)	
		{
			System.out.println("It is Polyndrom");
			
		}
		else 
			System.out.println("not poly");
			
			
	}
	
	
	
	
	
	
	
	
}


