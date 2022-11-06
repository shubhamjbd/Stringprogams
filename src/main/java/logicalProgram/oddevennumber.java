package logicalProgram;

import java.util.Scanner;

public class oddevennumber {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number6");
			   int num =sc.nextInt();
			
			if(num%2==0)
			{
				System.out.println("noumber is even");
				
			}
			
			else
			{
				System.out.println("number is odd");
			}
		}
		
 
	}

}
