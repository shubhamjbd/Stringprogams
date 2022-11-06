package logicalProgram;

public class Counting_string_in_sentence {

	public static void main(String[] args) {
            
		
		String name="my name is shubham";
		int counter=0;
		
		//System.out.println(name.length()-1);
		 
		
		for(int i=0;i<=name.length()-1;i++)
		{
			
			
			if(!name.equals(" "))
			{
				  counter++;
			}
			
		}
		System.out.println("print string length "+counter);
		
	}

}
