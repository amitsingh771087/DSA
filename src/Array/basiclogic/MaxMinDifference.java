package Array.basiclogic;

public class MaxMinDifference {

    public int MaxMinDifference(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return max - min;

    }

    public static void main(String[] args) {
        MaxMinDifference maxMinDifference = new MaxMinDifference();
        int[] arr = {1, 2, 3, 4, 5};
        int result = maxMinDifference.MaxMinDifference(arr);
        System.out.println("The difference between the maximum and minimum elements is: " + result);

    }

}
