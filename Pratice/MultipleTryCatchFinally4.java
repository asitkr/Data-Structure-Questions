class MultipleTryCatchFinally4
{
	public static int meth() {
		try
		{
			System.exit(0);
			return 777;
			
		}
		catch (Exception e)
		{
			return 888;
		}
		finally
		{
			return 999;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(meth());
	}
}
