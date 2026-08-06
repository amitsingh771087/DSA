package Array.basiclogic;

public class CheckElementExists {

    public boolean CheckElementExists(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        CheckElementExists checkElementExists = new CheckElementExists();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 212;
        boolean result = checkElementExists.CheckElementExists(arr, target);
        if (result) {
            System.out.println("The element " + target + " exists in the array.");
        } else {
            System.out.println("The element " + target + " does not exist in the array.");
        }

    }

}
