import java.util.*;

class LengthOfLargestSubarrayWithContiguousElements 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 12, 11};
		int n = arr.length;
		int ans = 0;

		for(int i=0; i<n-1; i++){
			int max = arr[i];
			int min = arr[i];

			Set<Integer> set = new HashSet<>();
			set.add(arr[i]);

				for(int j=i+1; j<n; j++){
					if(set.contains(arr[j])){
						break;
					}

					set.add(arr[j]);
					min = Math.min(min, arr[j]);
					max = Math.max(max, arr[j]);

					if(max - min == j-i){
						int len = j-i+1;
						if(len > ans){
							ans = len;
						}
					}
				}
		}

		System.out.println(ans);
	}
}
