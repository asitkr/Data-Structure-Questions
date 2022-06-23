class RearrangePositiveAndNegative
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14};

		int i=0;
		int j = arr.length-1;

		while(i < j){
			while(arr[i] >= 0){
				i++;
			}

			while(arr[j] < 0){
				j--;
			}

			if(i < j){
				swap(arr, i, j);
			}
		}

		int k = 0;
		while(k < arr.length && i < arr.length){
			swap(arr, k, i);
			k = k+2;
			i++;
		}

		printArray(arr);
	}

	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " " );
		}
	}
}
