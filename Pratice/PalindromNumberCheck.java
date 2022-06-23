import java.util.Scanner;

class PalindromNumberCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Number To chech number is palindrome or not");
		int num = sc.nextInt();
		int temp = num;
		int rev=0, rem;
		while(temp != 0 )
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num == rev)
		{
			System.out.println(num + " is a Palindrom number");
		}
		else
		{
			System.out.println(num + " is not a Palindrom number");
		}
	}
}
