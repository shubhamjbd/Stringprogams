package practice2;

public class PrimeNumber {

	public static void main(String[] args) {
		int counter=0;
		 int num=123;
		 
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
