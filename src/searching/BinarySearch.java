package searching;

public class BinarySearch {

    public static int binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 100};
        int target = 75;

        int result = binarySearch(target, arr);

        System.out.println("Element found at index: " + result);

    }

}
