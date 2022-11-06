package logicalProgram;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
 
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any String");
		String oriString=sc.next();                 //mom
		String revStr="";
		
		for(int i=oriString.length()-1;i>=0;i--)
		{
			revStr=revStr+oriString.charAt(i);
		}
		System.out.println("rev String is "+revStr);
		
		if(revStr.equalsIgnoreCase(oriString))
		{
			System.out.println("string is palindrome in nature");
		}
		else 
		{
			System.out.println("String is not palidrome in nature");
		}
	}

}
