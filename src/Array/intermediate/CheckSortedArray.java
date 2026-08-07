package Array.intermediate;

public class CheckSortedArray {

    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckSortedArray ch = new CheckSortedArray();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(ch.isSorted(arr));
        int[] arr1 = {2, 1, 2, 3, 2, 3, 3};
        System.out.println(ch.isSorted(arr1));

    }

}
