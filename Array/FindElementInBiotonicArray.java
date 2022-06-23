//import java.util.*;

class FindElementInBiotonicArray
{
	public static void main(String[] args) 
	{
		int[] arr =  {6, 7, 8, 10, 7, 5, -4};
		int key = 7;
		int n = arr.length;

		int x = findPeekElement(arr, 0, n-1);
		int a = ascBinarySearch(arr, 0, x-1, key);
		int b = desBinarySearch(arr, x+1, n-1, key);

		if(a == b){
			System.out.println("No Element found!!! ");
		}
		else{
			if(a > -1){
				System.out.println(a);
			}
			if(b > -1){
				System.out.println(b);
			}
		}

	}

	public static int findPeekElement(int[] arr, int start, int end){
		if(start == end) return start; //Array has only one element

		if(end == start+1  && arr[start] > arr[end]) return start; //Array has 2 element

		if(end == start+1 && arr[start] < arr[end]) return end; //Array has 2 element

		int mid = start + (end - start) / 2;

		if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;

		if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1])
			return findPeekElement(arr, start, mid-1);
		else
			return findPeekElement(arr, mid+1, end);
	}

	public static int ascBinarySearch(int[] arr, int start, int end, int key){
		while(start <= end){
			int mid = start + (end - start) / 2;

			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid] > key){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}

		return -1;
	}

	public static int desBinarySearch(int[] arr, int start, int end, int key){
		while(start <= end){
			int mid  = start + (end - start) / 2;

			if(arr[mid] == key){
				return mid;
			}
			else if(arr[mid] > key){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}

		return -1;
	}
}
