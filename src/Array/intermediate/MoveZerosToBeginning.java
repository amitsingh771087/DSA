package Array.intermediate;

public class MoveZerosToBeginning {

    public int[] MoveZerosToBeginning(int[] arr) {

        int j = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }

        while (j >= 0) {
            arr[j] = 0;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {

        MoveZerosToBeginning mz = new MoveZerosToBeginning();

        int[] arr = {1, 0, 3, 4, 0, 5};

        int[] result = mz.MoveZerosToBeginning(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
