class MergeTwoSortedArrayWithoutUsingSpace
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 5, 7};
		int[] brr = {0, 2, 6, 8, 9};

		int i=0;
		int j=0;

		while(i < arr.length && j < brr.length){
			if(arr[i] < brr[j]){
				System.out.print(arr[i] + " ");
				i++;
			}
			else{
				System.out.print(brr[j] + " ");
				j++;
			}
		}

		while(i < arr.length){
			System.out.print(arr[i] + " ");
			i++;
		}

		while(j < brr.length){
			System.out.print(brr[j] + " ");
			j++;
		}

		System.out.println();
	}
}
