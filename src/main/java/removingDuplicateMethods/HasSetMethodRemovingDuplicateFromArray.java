package removingDuplicateMethods;

import java.util.HashSet;
import java.util.TreeSet;

public class HasSetMethodRemovingDuplicateFromArray {

	public static void main(String[] args) {
		int[] a= {1,5,5,6,6,7,8,9,3,3,2,4,5,6,7,8,9,22,33,56,77,45,67,89,32};
		
		TreeSet<Integer> hs=new TreeSet<Integer>();//for ascending order,we can use HashSet here
		
		for(int i=0;i<a.length-1;i++)
		{
			hs.add(a[i]);
		}
		for(int ob:hs)
		{
		  System.out.print(ob+" ");
		 
		}
 
	}

}
