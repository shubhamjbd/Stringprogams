package logicalProgram;

import java.util.Scanner;

public class palindromeNumberbyrevrsString {

	public static void main(String[] args) {
 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		
		String intToString=Integer.toString(number);
		System.out.println("print converted int to string "+intToString);
		String revString = "";
		
		for(int i=intToString.length()-1;i>=0;i--)
		{
			revString=revString+intToString.charAt(i);
		}
		int stringTonumber = Integer.parseInt(revString);
		//System.out.println("rever integer is "+stringTonumber);
		
		if(stringTonumber==number)
		{
			System.out.println("noumber is palindrome number");
		}
		else 
		{System.out.println("number is not palidrome");
			
		}
		
		
		
		
	}

}
