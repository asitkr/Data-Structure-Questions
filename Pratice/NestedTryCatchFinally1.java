class NestedTryCatchFinally1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Outer try block");

			try
			{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch (NullPointerException e)
			{
				System.out.println("inner catch block");
			}

			System.out.println("Outer lowwer try block");

		}
		catch (Exception e)
		{
			System.out.println("outer catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
}
