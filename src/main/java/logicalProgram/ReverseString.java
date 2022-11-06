package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		
		String originstring=sc.next();
	    sc.close();
		
		String revString = "";
		
		for(int i=originstring.length()-1;i>=0;i--)
		{
	 
			revString=revString+originstring.charAt(i);
		}
		System.out.println("reverse String is "+revString);
		
		
		
 
	}

}
