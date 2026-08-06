package Array.basiclogic;

public class ReverseArray {

    public int[] ReverseArray(int[] arr) {
        int[] reverseArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length - 1 - i];
        }
        return reverseArray;
    }

    public static void main(String[] args) {

        ReverseArray reverseArray = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = reverseArray.ReverseArray(arr);
        System.out.print("The reversed array is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
