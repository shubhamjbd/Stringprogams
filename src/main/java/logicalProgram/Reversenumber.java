package logicalProgram;

public class Reversenumber {

	public static void main(String[] args) {

		int numb=123215,sum=0,temp =numb,rem;
		while(numb>0)
		{
		    rem=numb%10;
		    sum=sum*10+rem;
		    numb=numb/10;
		}
		System.out.println("reverse number is "+sum);
		
		
		
		numb=temp;
		
		if(numb==sum)
		{
			System.out.println("number is palindrome");
			
		}
		else 
		{
			System.out.println("numbewr is not palindrome");
		}
	}

}
