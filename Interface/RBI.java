interface Bank
{
	float rateOfIntrest();
}

class SBI implements Bank
{
	public float rateOfIntrest() 
	{
		return 9.15f;
	}
}

class PNB implements Bank
{
	public float rateOfIntrest() 
	{
		return 9.7f;
	}
}

class CBI implements Bank
{
	public float rateOfIntrest()
	{
		return 9.3f;
	}
}

class HDFC implements Bank
{
	public float rateOfIntrest()
	{
		return 9.4f;
	}
}

class RBI 
{
	public static void main(String[] args) 
	{
		Bank s = new SBI();
		Bank p = new PNB();
		Bank c = new CBI();
		Bank h = new HDFC();

		System.out.println("Rate of Intrest:-- " + "\n" + s.rateOfIntrest() + "\n" + p.rateOfIntrest() + "\n" + c.rateOfIntrest() + "\n" + h.rateOfIntrest());
	}
}
