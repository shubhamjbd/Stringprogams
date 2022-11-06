package practice2;

public class CountingSpace {

	public static void main(String[] args) {
		
		String str ="s h u b h a m";
		
           int counter=0;
     
     
     for(int i=0;i<=str.length()-1;i++)
     {
    	  char mychar=str.charAt(i);
    	  
    	  char space=' ';
    	  
    	     if (mychar==space)
    	     {
    	    	  counter++;
    	    	  
    	    	  
    	     }
    	     
     }
     System.out.println("number of space ikn string is "+counter);
    
     
	}

}
