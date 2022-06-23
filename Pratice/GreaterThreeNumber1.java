import java.util.Scanner;

class GreaterThreeNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();

		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();

		if (a>b && a>c)
		{
			System.out.println(a + " is Greater");
		}
		else if (b>a && b>c)
		{
			System.out.println(b + " is Greater");
		}
		else
		{
			System.out.println(c + " is Greater");
		}
	}
}
