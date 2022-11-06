package practice2;

public class PalindromenoumberByRevrsNoumberMethod {

	public static void main(String[] args) 
	{
		
	     
	     
		int num =53435;
		int revrse=0;
	for(int i=num;i>0;i=i/10)
	{
		int rem=i%10;
		revrse=revrse*10+rem;
		
	}
	
	System.out.println("print reversed number "+revrse);
	
	if(num==revrse)
	{
		System.out.println("number is paindrome number");
     }
	else {
		System.out.println("number is not palindrome");
	}
	
	//ArmstrongNumber
	System.out.println("====================================");
	
	//PalindromenoumberByRevrsNoumberMethod obj=new PalindromenoumberByRevrsNoumberMethod();
     Armsstrongnoumber(153);
     
     System.out.println("====================================");
     
     //prime noumber
     
   //primenumber
   		PalindromenoumberByRevrsNoumberMethod obj=new PalindromenoumberByRevrsNoumberMethod();
   		obj.primeNumber(123);  
    
	}
	
	public static  void Armsstrongnoumber(int num )
	{
		 
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+rem*rem*rem;
		}
		System.out.println("sum is "+sum);
		
		if(num==sum)
		{
			System.out.println("number is armstrong number");
			 
		}
		else
		{
			System.out.println("noumber is not armstromgnumber");
		}
		 
	    }
	
	//primenoumber
	
	public void primeNumber(int num)
	{
		int counter=0;
		System.out.println("print number "+num);
		 
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				
				counter++;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("number is not prime number");
		}
		else 
		{
			System.out.println("number is prime number");
		}
		 
		
	}
	
	 
}	

