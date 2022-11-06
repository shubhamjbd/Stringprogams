package logicalProgram;

import java.util.Scanner;

public class erverseingstringBysplit {

	public static void main(String[] args) {
 
		
//		
//	    Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//                    //my name is shubahm
//		
//		String s= sc.next();
		
		String s="my name is shubbham";
		String[] ar=s.split(" ");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" " );
		}
		 
	 
		 
		
		
	}

}
