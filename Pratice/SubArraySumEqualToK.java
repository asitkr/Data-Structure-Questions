class SubArraySumEqualToK 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{3, 4, -7, 1, 3, 3, 1, -4};
		int n = arr.length;

		int k = 7;

		int subArray = 0;
		
		for(int i=0; i<n; i++){
			int sum = 0;
			for(int j=i; j<n; j++){
				sum += arr[j];
				if(sum == k){
					subArray++;
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

		System.out.println(subArray);
	}
}
