import java.util.Scanner;

class PalindromeNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to show Palindrome Number: ");
		int no = sc.nextInt();
		int temp = no;
		int rev=0, rem;

		while(temp != 0)
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}

		if (no == rev)
		{
			System.out.println(no + " is a Palindrome Number");
		}
		else
		{
			System.out.println(no + " is not a Palindrome Number");
		}
	}
}
