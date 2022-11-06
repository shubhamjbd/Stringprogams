package removingDuplicateMethods;

import java.util.ArrayList;

public class RemovingDuplicateFromCollecton {

	public static void main(String[] args) {
		
		ArrayList<String> ar1= new ArrayList<String>();
		
		ar1.add("dipak");
		ar1.add("dipak");
		ar1.add("sagar");
		ar1.add("shubham");
		
		ArrayList<String> newArr=new ArrayList<String>();
		
		for(int i=0; i<ar1.size();i++)
		{
			if(!newArr.contains(ar1.get(i)))
			{
				newArr.add(ar1.get(i));
			}
		}
		System.out.println(newArr);
 
		
	}

}
