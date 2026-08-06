package Array.basiclogic;

public class FirstOccurrence {

    public int FirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        FirstOccurrence firstOccurrence = new FirstOccurrence();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = firstOccurrence.FirstOccurrence(arr, target);
        if (result != -1) {
            System.out.println("The first occurrence of " + target + " in the array is at index: " + result);
        } else {
            System.out.println("The element " + target + " does not exist in the array.");
        }

    }

}
