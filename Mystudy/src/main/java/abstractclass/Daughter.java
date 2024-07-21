package abstractclass;

public class Daughter extends Mother
{
	public void name()
	{
		System.out.println("Ajitha");
	}

	public static void main(String[] args) 
	{
		Mother obj=new Daughter ();
		obj.name();
		obj.show();
		

	}

}
