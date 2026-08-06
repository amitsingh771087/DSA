package Array.basiclogic;

public class SecondLargestElement {

    public int secondLargestElement(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];

            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargestElement obj = new SecondLargestElement();
        int[] arr = {5, 1, 4, 3, 7, 6};
        System.out.println("Second Largest Element is: " + obj.secondLargestElement(arr));

    }

}
