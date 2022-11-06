package logicalProgram;

public class Reapitation {

	public static void main(String[] args) {
	
		String str="asjaafdjfhdjfdkjfnkdjbkjaaa";
		int counter=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char mychar=str.charAt(i);
			
			char a='a';
			
			if(mychar==a)
			{
				counter++;
			}
			
		}
		System.out.println("a is repeated by "+counter+"times");
 
	}

}
