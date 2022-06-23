import java.util.*;

class SplitAStringInToStringArray
{
	public static void main(String[] args) 
	{
		String str = "i like apple";
		//output Array  => {"i", "like","apple"}
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
	}
}
