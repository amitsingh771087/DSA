package Array.basiclogic;

public class LastOccurrence {

    public int LastOccurrence(int[] arr, int target) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;

    }

    public static void main(String[] args) {

        LastOccurrence lastOccurrence = new LastOccurrence();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        int target = 5;
        int result = lastOccurrence.LastOccurrence(arr, target);
        if (result != -1) {
            System.out.println("The last occurrence of " + target + " in the array is at index: " + result);
        } else {
            System.out.println("The element " + target + " does not exist in the array.");
        }

    }

}
