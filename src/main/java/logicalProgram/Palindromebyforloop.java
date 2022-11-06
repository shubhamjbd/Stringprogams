package logicalProgram;

public class Palindromebyforloop {

	public static void main(String[] args) 
	{
       int number=12321;
       int reversenum = 0;
       
       for(int i=number;i>0;i=i/10)
       {
    	 int  rem=i%10;
    	 reversenum=reversenum*10+rem;
    	   
       }
       System.out.println("reverse number is "+reversenum);
       
       System.out.println("number is "+number);
       
       if (reversenum==number)
       {
    	   System.out.println("number is palindrome number");
       }
       else
       {
    	   System.out.println("number is NOT palindrome nuber");
       }
       
	}

}
