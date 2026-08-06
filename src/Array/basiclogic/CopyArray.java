package Array.basiclogic;

public class CopyArray {

    public int[] CopyArray(int[] arr) {
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static void main(String[] args) {

        CopyArray copyArray = new CopyArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = copyArray.CopyArray(arr);
        System.out.print("The copied array is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
