package Array.basics;

public class SumOfElements {

    public int sumOfElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        SumOfElements obj = new SumOfElements();
        int[] arr = {1, 2, 3, 4};
        System.out.println("Sum of Elements is : " + obj.sumOfElement(arr));
    }
}
