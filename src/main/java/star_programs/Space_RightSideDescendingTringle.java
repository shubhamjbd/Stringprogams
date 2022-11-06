package star_programs;

public class Space_RightSideDescendingTringle {

	public static void main(String[] args)
	{
		//starting with 0 space an
		//and 5 star
		
		int space=0;
		int star=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
			
		}
	}

}
