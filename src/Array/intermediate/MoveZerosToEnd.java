package Array.intermediate;

import utility.*;

public class MoveZerosToEnd {

    public int[] MoveZerosToEnd(int[] arr) {
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return arr;
        }

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                utility.Swapping.swap(arr, i, j);
                j++;

            }
        }
        return arr;

    }

    public static void main(String[] args) {

        MoveZerosToEnd mz = new MoveZerosToEnd();

        int[] arr = {0, 1, 0, 3, 12, 0, 5, 0, 8, 9, 0};

        int[] result = mz.MoveZerosToEnd(arr);

        System.out.print("Array after moving zeros to end: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
