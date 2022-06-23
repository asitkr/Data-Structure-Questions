class ContainerWithMostWater
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int n = arr.length;

		System.out.println(maxArea(arr, n));
	}

	public static int maxArea(int[] arr, int n){
		int area = 0;
		int max = 0;
		int low = 0;
		int high = n-1;

		while(low < high){
			if(arr[low] < arr[high]){
				area = arr[low] * (high - low);
				low++;
			}
			else if(arr[low] >= arr[high]){
				area = arr[high] * (high - low);
				high--;
			}

			max = area > max ? area : max;
		}

		return max;
	}
}
