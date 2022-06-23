class FindMaxValue 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1, 20, 4, 80, 90, 40, 9};
		int max1 = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			max1 = Math.max(max1, arr[i]);
		}
		System.out.println(max1);
	}
}
