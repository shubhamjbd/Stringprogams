package logicalProgram;

public   class CountingSpace {

	public static void main(String[] args) {
		
		String sr="s h u b h a m";
		int counter=0;
		
		for (int i=0;i<sr.length()-1;i++)
		{
			char mychar=sr.charAt(i);
			
			char blanlk=' ';
			
			if(mychar==blanlk)
			{
				counter++;
			}
			
		}
		System.out.println("total spaces are "+counter);
		
 
		
	}

	 
}
