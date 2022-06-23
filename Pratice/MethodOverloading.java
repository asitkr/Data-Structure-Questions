//Method Overloading: changing no. of arguments

class Add
{
	static int add(int a, int b)
	{
		return a+b;
	}

	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Add ad = new Add();
		System.out.println(ad.add(2, 5));
		System.out.println(ad.add(4, 2, 6));
	}
}
