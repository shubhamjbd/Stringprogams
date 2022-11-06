package practice2;

public class palindromeCheck {

	public static void main(String[] args) {
 
		//palindrome check byconversionto string
		
		int num=123251;
		String numTOstring=Integer.toString(num);
		String revesrString = "";
		for(int i=numTOstring.length()-1;i>=0;i--)
			{
			revesrString=revesrString+numTOstring.charAt(i);
			}
		System.out.println("print reverse String "+revesrString);
		
		int num2=Integer.parseInt(revesrString);
		
		
		if(num2==num)
		{
			System.out.println("noumber is palindrome");
		}
		else {
			System.out.println("noumber is not palidrome");
		}
	}

}
