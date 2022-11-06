package practice2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDupliateFromCollection {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>arr =new ArrayList<Integer>();
		arr.add(21);
		arr.add(21);
		arr.add(22);
		arr.add(23);
		
		LinkedHashSet<Integer> linkSEt=new LinkedHashSet<Integer>();
		
		linkSEt.addAll(arr);
		arr.clear();
		arr.addAll(linkSEt);
		
		System.out.print(arr);
			
		
	}

}
