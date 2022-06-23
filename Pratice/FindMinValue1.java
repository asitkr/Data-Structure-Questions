class FindMinValue1
{
	public static void main(String[] args) 
	{
		//Find Smallest Number
		int[] arr = new int[]{1, 20, -80, 90, 40, -9, 0};
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;

		//Find First Minimum Value
		for(int i=0; i<arr.length; i++){
			min1 = Math.min(min1, arr[i]);
		}

		//Find Second Minimum Value
		for(int i=0; i<arr.length; i++){
			if(arr[i] > min1){
				min2 = Math.min(min2, arr[i]);
			}
		}

		//Find Third Minimum Value
		for(int i=0; i<arr.length; i++){
			if(arr[i] > min2){
				min3 = Math.min(min3, arr[i]);
			}
		}

		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
	}
}
