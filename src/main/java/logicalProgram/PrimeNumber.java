package logicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
       
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int numb=sc.nextInt();
		int counter = 0;
for(int i=2;i<numb;i++)
			
   {
		if (numb%i==0)
		{
			counter++;
			break;
		}
   }
		if(counter==1)
		{
			System.out.println(+numb+" is not prime number");
		}
		else
		{
			System.out.println(+numb+" is prime number");
		}
   
		
		
	}

}
