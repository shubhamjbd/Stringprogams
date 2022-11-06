package practice2;

public class CountRepitation {

	public static void main(String[] args) {
 
		String word="hhhhgghgh";
	   int counter=0;
	   
	   
	   for(int i=0;i<=word.length()-1;i++)
	   {
		   char Mychar=word.charAt(i);
		   char myH='g';
		   
		   if(Mychar==myH)
		   {
			   counter++;
		   }
	   }
	   System.out.println("counting of his "+counter);
	 
		
		
		
	}

}
