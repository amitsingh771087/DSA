package Array.basics;

public class ReversePrint {

    public void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        ReversePrint obj = new ReversePrint();
        int[] arr = {1, 2, 3, 4, 5};
        obj.reverseArray(arr);

    }

}
