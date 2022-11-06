package practice2;

public class justanything{

	public static void main(String[] args) {
		
	  String str="s h u b h a m";
	  int counter=0;
	  String reverse="";
	  String[] nstr=str.split(" ");
	  
	  for(int i=nstr.length-1;i>=0;i-- )
	  {
		  reverse=reverse+str.charAt(i);
	 
	  }
	  System.out.println(reverse);
	}

}
