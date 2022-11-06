package logicalProgram;

public class CountingCharacerWithoutSpace {

	public static void main(String[] args) {
            
		String name= "my name is         ";
		
		int counter=0;
		
		
		for(int i=0;i<=name.length()-1;i++)
		{ 
			char mychar=name.charAt(i);
			if(!(mychar==' '))//or directly ( name.charAt(i)!=' ')
			{
				counter++;
			}
			 
		}
		System.out.println("character without space are "+counter);	
	}

}
