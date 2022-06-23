package sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr  = new int[]{9, 2, 7, 1, 5, 8, 3, 0, 4, 6};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int smallest = i;
            for (int j = i+1; j < n; j++) {
                if(arr[smallest] < arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArraySorted(arr);
    }

    static void printArraySorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
