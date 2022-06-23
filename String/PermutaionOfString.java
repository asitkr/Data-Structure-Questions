import java.util.*;

class PermutaionOfString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		printPermutation(s, "");
	}

	public static void printPermutation(String s, String str){
		if(s.length() == 0){
			System.out.println(str);
			return;
		}

		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);

			String leftPart = s.substring(0, i);
			String rightPart = s.substring(i+1);

			String ans = leftPart + rightPart;

			printPermutation(ans, str + ch);
		}
	}
}
