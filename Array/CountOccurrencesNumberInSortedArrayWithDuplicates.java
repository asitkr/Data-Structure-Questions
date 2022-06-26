import java.util.*;

class CountOccurrencesNumberInSortedArrayWithDuplicates 
{

	// count occurrences of a number in a sorted array with duplicates
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		int first = firstOccurence(arr, 0, n-1, target);
		int last = lastOccurence(arr, 0, n-1, target);

		System.out.println(last - first + 1);
	}

	public static int firstOccurence(int[] arr, int start, int end, int target){
		int result = -1;
		while(start <= end){
	        int mid = start + (end - start) / 2;
	        
	        if(arr[mid] == target){
	            result = mid;
	            end = mid - 1;
	        }
	        else if(arr[mid] > target){
	            end = mid - 1;
	        }
	        else{
	            start = mid + 1;
	        }
	    }

		return result;
	}

	public static int lastOccurence(int[] arr, int start, int end, int target){
		int result = -1;
		while(start <= end){
	        int mid = start + (end - start) / 2;
	        
	        if(arr[mid] == target){
	            result = mid;
	            start = mid + 1;
	        }
	        else if(arr[mid] > target){
	            end = mid - 1;
	        }
	        else{
	            start = mid + 1;
	        }
	    }

		return result;
	}
}
