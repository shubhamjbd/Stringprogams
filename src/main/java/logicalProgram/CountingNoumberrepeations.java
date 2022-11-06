package logicalProgram;

public class CountingNoumberrepeations {

	public static void main(String[] args) {
		
		int num=100111;                                                   //double num=1100111111111111111111111111111111111111111111111111111d;
		int counter=0;
		
	   String intTostring=Integer.toString(num);
	   
	   for(int i=0;i<=intTostring.length()-1;i++)
	   {
		   char Mychar=intTostring.charAt(i);
		   char one='1';
		   
	        if(one==Mychar)
	            {
		            counter++;
	            }
	   
	   } 
	   System.out.println("1 is repeated by "+counter);
	   
 
	}

}
