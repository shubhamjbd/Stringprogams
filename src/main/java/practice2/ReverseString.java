package practice2;

public class ReverseString {
	
	

	public static void main(String[] args) {
   String name="my name is shubham";
  
   
  
   
   String[] newName=name.split(" ");
   
   for(int i=newName.length-1;i>=0;i--)
   {
	   String rvrsestring=" ";
	    rvrsestring=newName[i];
	    System.out.print(" "+rvrsestring);
	    
   }
   
   
   
   
	}

}
