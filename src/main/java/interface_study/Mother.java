package interface_study;

public interface Mother 
{

	static void nature()
	{
		System.out.println("Mothers Nature");
	}
	
	 default void love()
	{
		System.out.println("Mothers Love");
	}
}
