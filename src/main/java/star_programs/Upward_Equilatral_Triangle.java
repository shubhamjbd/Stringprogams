package star_programs;

public class Upward_Equilatral_Triangle {

	public static void main(String[] args) {
		int space=5;
		int star=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=star;j++)
				{
					System.out.print("*");   
				}
				System.out.println();
				space--;
				star=star+2;
				
				
				
		}
	}

}
