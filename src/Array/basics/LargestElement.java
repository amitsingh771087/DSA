package Array.basics;

public class LargestElement {

    public int largestElement(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        LargestElement obj = new LargestElement();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Largest Element is : " + obj.largestElement(arr));

    }

}
