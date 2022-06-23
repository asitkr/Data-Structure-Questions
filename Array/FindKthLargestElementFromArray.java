import java.util.*;

class FindKthLargestElementFromArray
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int[] arr  = {10, 5, 17, 20, 8, 6};
		int k = 3;

		System.out.println(findKthLargest(arr, k));
	}

	public static int findKthLargest(int[] arr, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i=0; i<k; i++){
			pq.add(arr[i]);
		}

		for(int i=k; i<arr.length; i++){
			if(pq.peek() < arr[i]){
				pq.remove();
				pq.add(arr[i]);
			}
		}

		return pq.peek();
	}
}
