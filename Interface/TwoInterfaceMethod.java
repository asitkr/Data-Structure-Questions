interface A
{
	public void aaa();
}

interface B
{
	public void aaa();
}

class TwoInterfaceMethod implements A,B
{
	public void aaa() {
		System.out.println("aaa Method");
	}

	public static void main(String[] args) 
	{
		TwoInterfaceMethod tim = new TwoInterfaceMethod();
		tim.aaa();
	}
}
