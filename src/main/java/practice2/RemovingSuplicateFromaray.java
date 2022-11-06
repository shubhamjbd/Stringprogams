package practice2;

import java.util.TreeSet;

public class RemovingSuplicateFromaray {

	public static void main(String[] args) {
		
	int [] ar= {1,2,3,4,5,5,6,6,7,7};
	//String [] str= {"abc,adf,afg,abc,adf"};//not works
	
	//String [] str=new String[4];
	//str[0]="abc";
	                           //then doing regular process
	TreeSet<Integer> tr=new TreeSet<Integer>();
	
	for(int i=0;i<=ar.length-1;i++)
	{
		tr.add(ar[i]);
	}
	for(int ob:tr)
	{
		System.out.print(" "+ob);
	}
 
	}

}
