class NextGreaterElementRight
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 3, 2, 4,};

		int[] brr = new int[arr.length];

		for(int i=0; i<arr.length; i++){
			int next = -1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] < arr[j]){
					next = arr[j];
					break;
				}
			}
			brr[i] = next;
		}


		for(int i=0; i<brr.length; i++){
			System.out.print(brr[i] + " ");
		}

		//time complexity --- O(n^2)
		//Space complexity -------- O(n)
	}
}
