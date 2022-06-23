class NonStatic
{
	static int a;

	NonStatic()
	{
		System.out.println("Constructor");
	}

	{
		System.out.println("Non Static block");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new NonStatic();
		NonStatic.a = 100;
		System.out.println(a);
	}
}
