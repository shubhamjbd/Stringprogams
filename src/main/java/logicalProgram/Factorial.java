package logicalProgram;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nummber");
		int number=sc.nextInt();
		sc.close();
		
		//5*4*3*2*1
		int fact=1;
		for (int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+number+" is "+fact);
		
 
	}

}
