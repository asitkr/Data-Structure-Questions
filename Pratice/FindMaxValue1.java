class FindMaxValue1
{
	public static void main(String[] args) 
	{
		//Find Highest Maximum
		int[] arr = new int[]{1, 20, 4, 80, 90, 40, 9};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;

		//Find First Highest Maximum
		for(int i=0; i<arr.length; i++){
			max1 = Math.max(max1, arr[i]);
		}

		//Find Second Highest Maximum
		for(int i=0; i<arr.length; i++){
			if(arr[i] < max1){
				max2 = Math.max(max2, arr[i]);
			}
		}

		//Find Third Highest Maximum
		for (int i=0; i<arr.length; i++){
			if(arr[i] < max2){
				max3 = Math.max(max3, arr[i]);
			}
		}

		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}
}