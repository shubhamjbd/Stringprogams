package practice2;

public class Palindromtest2 {

	public static void main(String[] args) {

   int numb=123213;
   
   int revrse =0;
   
   for(int i=numb;i>0;i=i/10)
   {
	   int rem=i%10;
	   revrse=revrse*10+rem;
   }
   System.out.println("revese number is "+revrse);
   
   if(numb==revrse)
   {
	   System.out.println(numb+"   is palindrome number");
   }
   else {
	   System.out.println(numb+    "  is not palindrome number");
   }
	}

}
