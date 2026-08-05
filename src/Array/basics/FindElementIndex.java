package Array.basics;

public class FindElementIndex {

    public int findElementIndex(int[] arr, int targer) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targer) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        FindElementIndex obj = new FindElementIndex();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = obj.findElementIndex(arr, target);
        if (index != -1) {
            System.out.println("Element found at index : " + index);
        } else {
            System.out.println("Element not found");
        }

    }

}
