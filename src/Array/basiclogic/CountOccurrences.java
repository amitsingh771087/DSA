package Array.basiclogic;

public class CountOccurrences {

    public int CountOccurrences(int[] arr, int targer) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targer) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        CountOccurrences countOccurrences = new CountOccurrences();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        int target = 5;
        int result = countOccurrences.CountOccurrences(arr, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + result);

    }

}
