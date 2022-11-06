package logicalProgram;

import java.util.Scanner;

public class revsenumberusingstring {

	public static void main(String[] args) {
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		try {
		int oriInt = sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
 
		
		int oriInt =sc.nextInt();
		String oriIntToString=Integer.toString(oriInt);
		String revString="";
		
		for(int i=oriIntToString.length()-1;i>=0;i--)
		{
			revString=revString+oriIntToString.charAt(i);
		}
		int revInteger = Integer.parseInt(revString);
		System.out.println("reverse integer is "+revInteger);
	}

}
