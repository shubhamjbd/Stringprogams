package removingDuplicateMethods;

import java.util.HashSet;
import java.util.TreeSet;

public class REmovingDuplicateString {

	public static void main(String[] args) {
		//String[] a= { "abc,asb,abc"};
		String[] st=new String[4];
		st[0]="shubham";
		st[1]="shubham";
		st[2]="dipak";
		st[3]="sagar";
		
		
		HashSet<String> hs=new HashSet<String>();//for ascending order,we can use HashSet here
		
		for(int i=0;i<st.length;i++)
		{
			hs.add(st[i]);
		}
		for(String ob:hs)
		{
		  System.out.print(ob+" ");
		 
		}
 
	}

}
