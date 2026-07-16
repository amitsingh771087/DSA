package searching;

public class LinearSearch {

    public static int linerSearch(int target, int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {85, 25, 15, 45, 75, 95, 55, 65, 35, 5, 100};
        int target = 75;

        int result = linerSearch(target, arr);

        System.out.println("Element found at index: " + result);

    }
}
