package Array.basics;

public class SmallestElement {

    public int smallestElement(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        SmallestElement obj = new SmallestElement();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Smallest Element is : " + obj.smallestElement(arr));

    }

}
