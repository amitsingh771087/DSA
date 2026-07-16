package sorting;

import utility.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            int didswap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swapping.swap(arr, j, j + 1);
                    didswap = 1;
                }
            }
            if (didswap == 0) {
                break;
            }
            System.out.println("runs");

        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
