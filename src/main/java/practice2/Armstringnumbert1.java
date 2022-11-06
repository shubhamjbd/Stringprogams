package practice2;

import java.util.Scanner;

public class Armstringnumbert1 {

	public static void main(String[] args) {
 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the number");
		int numb=sc.nextInt();
		sc.close();
		
		//int numb=163;
		int sum=0;
		for(int i=numb;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+rem*rem*rem;
			
		}
		System.out.println("sum is "+sum);
		
		if(numb==sum){
			System.out.println("number is armsstrong number");
		}
		else {
			System.out.println("number is not armstrong number");
		}
		}
	}


