class MinimumSwapToMakeTwoArrayIdentical 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		int[] brr = {3, 4, 5, 2, 1};

		System.out.println(minSwap(arr, brr));
	}

	public static int minSwap(int[] arr, int[] brr){
		int count = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != brr[i]){
				int j = i+1;
				
				while(brr[j] != arr[i]){
					j++;
				}

				swap(brr, i, j);
				count++;
			}
		}

		return count;
	}

	public static void swap(int[] brr, int i, int j){
		int temp = brr[i];
		brr[i] = brr[j];
		brr[j] = temp;
	}
}
