package sorting;

import java.util.Scanner;

public class QuickSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        quickSort(arr, 0, n-1);

        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");

        sc.close();
    }

    static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivotIndex = quick_sort(arr, start, end);
            quickSort(arr, start, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

    static int quick_sort(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j=start; j<=end-1; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
}
