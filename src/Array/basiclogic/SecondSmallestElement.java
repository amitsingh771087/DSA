package Array.basiclogic;

public class SecondSmallestElement {

    public int SecondSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (arr.length < 2) {
            return -1;

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];

            }

        }
        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;

    }

    public static void main(String[] args) {
        SecondSmallestElement obj = new SecondSmallestElement();
        int[] arr = {5, 1, 4, 3, 7, 6};
        System.out.println("Second Smallest Element is: " + obj.SecondSmallestElement(arr));

    }

}
