package interface_study;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		
		Son s= new Son();
		s.money();
		s.love();
		s.rules();
		Father.nature();// calling static complete method from interface
		Mother.nature();//calling static complete method from interface
		
	}

	

	@Override
	public void love() 
	{
		//to call specific default method from super interface follow syntax
		// interfacename.super.methodname
		System.out.println("Sons love");
		Father.super.love();// calling default Love method form father
		Mother.super.love();// calling default Love method form Mother
		
	}

	@Override
	public void money() {
		System.out.println("Fathers money completed in Son's Class");
		
	}

	@Override
	public void rules() {
		System.out.println("Fathers rules completed in Son's Class");
		
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		
	}

}
