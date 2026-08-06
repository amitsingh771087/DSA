package Array.basiclogic;

import utility.*;

public class ReverseArrayInPlace {

    public int[] ReverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            Swapping.swap(arr, start, end);
            start++;
            end--;

        }
        return arr;
    }

    public static void main(String[] args) {

        ReverseArrayInPlace reverseArrayInPlace = new ReverseArrayInPlace();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = reverseArrayInPlace.ReverseArrayInPlace(arr);
        System.out.print("The reversed array in place is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
