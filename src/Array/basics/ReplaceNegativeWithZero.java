package Array.basics;

public class ReplaceNegativeWithZero {

    public int[] replaceNegativeWithZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        ReplaceNegativeWithZero obj = new ReplaceNegativeWithZero();
        int[] arr = {-5, 10, -2, 7};
        int[] result = obj.replaceNegativeWithZero(arr);
        System.out.println("Array after replacing negative elements with zero: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
