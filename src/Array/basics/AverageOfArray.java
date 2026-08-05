package Array.basics;

public class AverageOfArray {

    public int averageOfArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;
        return avg;

    }

    public static void main(String[] args) {

        AverageOfArray obj = new AverageOfArray();
        int[] arr = {10, 20, 30, 40};
        System.out.println("Average of Elements is : " + obj.averageOfArray(arr));

    }

}
