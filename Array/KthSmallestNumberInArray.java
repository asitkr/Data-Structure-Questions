import java.util.*;

class KthSmallestNumberInArray
{
	public static void main(String[] args) 
	{
		int[] arr = { 12, 3, 5, 7, 19 };
		int k = 2;
		Arrays.sort(arr);

		System.out.println(arr[k-1]);
	}
}
