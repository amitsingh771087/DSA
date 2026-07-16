package sorting;

import utility.Swapping;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            Swapping.swap(arr, min, i);

        }

    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 5, 6, 9, 8};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
