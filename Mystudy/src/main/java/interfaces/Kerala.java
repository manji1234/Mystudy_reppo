package interfaces;

public class Kerala implements India
{
 public void show()
{
	System.out.println("I love India");
}
	public static void main(String[] args)
	{
		India obj=new Kerala();
		obj.show();
		
	}

}
