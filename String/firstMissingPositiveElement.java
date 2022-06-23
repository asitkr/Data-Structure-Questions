import java.util.*;

class firstMissingPositiveElement
{
	public static void main(String[] args) 
	{
		int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 };
		int arr1[] = {2, 3, 7, 6, 8, -1, -10, 15};
		int arr2[] = {1, 1, 0, -1, -2};

		System.out.println(firstMissingPositive(arr));
		System.out.println(firstMissingPositive(arr1));
		System.out.println(firstMissingPositive(arr2));
	}

	public static int firstMissingPositive(int[] arr){
		Arrays.sort(arr);
		int ans = 1;

		for(int i=0; i<arr.length; i++){
			if(arr[i] == ans){
				ans++;
			}
		}

		return ans;
	}
}
