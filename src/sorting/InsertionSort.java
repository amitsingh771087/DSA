package sorting;

import utility.*;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                Swapping.swap(arr, j - 1, j);
                j--;

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 9, 8};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
