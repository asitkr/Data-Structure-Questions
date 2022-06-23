package sorting;

import java.util.Scanner;

public class MergeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        mergeSort(arr, 0, n-1);

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, end, mid);
        }
    }

    public static void merge(int[] arr, int start, int end, int mid){
        int asize = mid - start + 1;
        int bsize = end - mid;
        int[] a = new int[asize];
        int[] b = new int[bsize];

        int k = 0;
        for (int i = start; i <= mid; i++) {
            a[k++] = arr[i];
        }

        k = 0;
        for (int i = mid+1; i <= end; i++) {
            b[k++] = arr[i];
        }

        int i=0, j=0;
        k = start;

        while (i < asize && j < bsize) {
            if(a[i] < b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
        }

        while (i < asize) {
            arr[k++] = a[i++];
        }

        while (j < bsize) {
            arr[k++] = b[j++];
        }
    }
}
