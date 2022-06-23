class KthNonRepeatingCharcterInString 
{
	public static void main(String[] args) 
	{
		String str = "geeksforgeeks";
		int n = str.length();
		int k = 3;

		int[] arr = new int[256];

		for(int i=0; i<n; i++){
			arr[str.charAt(i)]++;
		}

		int i = 0;
		int count = 0;
		while(i < n){
			if(arr[str.charAt(i)] == 1){
				count++;
			}

			if(count == k){
				break;
			}

			i++;
		}

		if(i == n){
			System.out.println("K'th non repeating char is not present ");
		}
		else{
			System.out.println(str.charAt(i));
		}
	}
}
