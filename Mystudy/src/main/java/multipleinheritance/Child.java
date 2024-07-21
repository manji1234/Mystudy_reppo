package multipleinheritance;

public class Child implements Mother,Father
{
public void fname()
{
	System.out.println("Ashok ");
}
public void mname()
{
	System.out.println("Ajitha");
}
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.fname();
		obj.mname();
	}

}
