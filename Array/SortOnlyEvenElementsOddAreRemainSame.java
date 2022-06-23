import java.util.*;

class  SortOnlyEvenElementsOddAreRemainSame
{
	public static void main(String[] args) 
	{
		int[] arr = {-1, -5, -2, -6, 9, -3, 0, 6, 7, 2, 8, 5, 4, 1};
		int n = arr.length;

		//Sort Only Even Elements Odd Are Remain at Same Place

		int even = 0;
		for(int i=0; i<n; i++){
			if(arr[i]%2 == 0){
				even++;
			}
		}

		int j = 0;
		int[] brr = new int[even];
		for(int i=0; i<n; i++){
			if(arr[i]%2 == 0){
				brr[j++] = arr[i];
			}
		}

		Arrays.sort(brr);
		j = 0;
		for(int i=0; i<n; i++){
			if(arr[i]%2 == 0){
				arr[i] = brr[j++];
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
