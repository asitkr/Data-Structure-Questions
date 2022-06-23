package sorting;

import java.util.Arrays;

public class BinarySearchReturnIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{17, 47, 2, 36, 58, 9, 60, 4};
        int n = arr.length;
        int target = 4;
        Arrays.sort(arr);
        System.out.println(returnIndex(arr, n, target));
    }

    public static int returnIndex(int[] arr, int n, int target){
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = (start + end) >> 1;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }

            else if(arr[mid] == target){
                return mid;
            }
        }

        return -1;
    }
}
