import java.util.*;

class SeprateMaxAndMinInDiffrentArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 4, 7, 8, 10};
		int[] arr2= {2, 3, 9};

		int i = 0;
		int k = arr1.length-1;
		int j = 0;

		while(i < k && j < arr2.length){
			if(arr1[i]< arr2[j]){
				i++;
			}
			else if(arr1[i] > arr2[j]){
				int temp = arr2[j];
				arr2[j] = arr1[k];
				arr1[k] = temp;
				i++;
				k--;
				j++;
			}
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
