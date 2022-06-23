class PrivateMember 
{
	private static int a = 10;

	public static void main(String[] args) 
	{
		System.out.println("a: " + PrivateMember.a);
		PrivateMember pm = new PrivateMember();
		pm.method();
	}

	private void method()
	{
		System.out.println("Private method");
	}
}
