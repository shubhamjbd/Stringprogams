package removingDuplicateMethods;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ByUsingSetRemovingFromDuplicate {

	public static void main(String[] args) {

		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("dipak");
		ar1.add("dipak");
		ar1.add("sagar");
		ar1.add("shubham");
		
		LinkedHashSet<String> Lset=new LinkedHashSet<String>();
		
		Lset.addAll(ar1);
		ar1.clear();
		ar1.addAll(Lset);
		
		System.out.println(ar1);
//		for(int i=0;i<=ar1.size();i++)
//		{
//			System.out.println(ar1);
//		}
	}

}
