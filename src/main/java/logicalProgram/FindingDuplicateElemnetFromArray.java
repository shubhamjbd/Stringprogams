package logicalProgram;

public class FindingDuplicateElemnetFromArray {

	public static void main(String[] args) {

int [] a= {1,2,2,3,4,5,5,6,7,8};  //another ways modification
int[] temp=new int[a.length];     //remove temp
int j=0;

for(int i=0;i<a.length-1;i++)
{
	
	if(a[i]!=a[i+1])   
	{
		 
		 temp[j]=a[i];  //a[j]=a[i]
		j++;
	 }
	
	
}
       temp[j]=a[a.length-1];  //a[j]=a[a.lemgth-1]
       
       for(int i=0;i<=temp.length-1;i++ ) //(int i=0;i<j+1;i++)
       {
    	   System.out.print(temp[i]+" ");
      
	    }

}
}
