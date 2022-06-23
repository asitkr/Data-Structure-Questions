class SortBitonicArray
{
	public static void main(String[] args) 
	{
		// Input: arr[] = {5, 10, 15, 25, 20, 3, 2, 1} 
		// Output: 1 2 3 5 10 15 20 25
		// Input: arr[] = {5, 20, 30, 40, 36, 33, 25, 15, 10} 
		// Output: 5 10 15 20 25 30 33 36 40

		int[] arr = {5, 10, 15, 25, 20, 3, 2, 1};
		int[] arr1 = {5, 20, 30, 40, 36, 33, 25, 15, 10};
		int n = arr.length;
		int m = arr1.length;

		sortArray(arr, n);
		sortArray(arr1, m);
	}

	public static void sortArray(int arr[], int n){
		int low = 0;
		int high = n-1;
		int peek = -1;

		while(low <= high){
			int mid = low + (high - low) / 2;

			if((mid == 0 || arr[mid-1] < arr[mid]) && (mid == n-1 || arr[mid+1] < arr[mid])){
				peek = mid;
				break;
			}
			else if(arr[mid] < arr[mid+1]){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}

		low = 0;
		high = n-1;
		int k = 0;
		int[] ans = new int[n];

		while(low <= peek && high > peek){
			if(arr[low] < arr[high]){
				ans[k++] = arr[low++];
			}
			else{
				ans[k++] = arr[high--];
			}
		}

		while(low <= peek){
			ans[k++] = arr[low++];
		}

		while(high > peek){
			ans[k++] = arr[high--];
		}

		printArray(ans, n);
	}

	public static void printArray(int[] arr, int n){
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
}
