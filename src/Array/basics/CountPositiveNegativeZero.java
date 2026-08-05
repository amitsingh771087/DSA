package Array.basics;

public class CountPositiveNegativeZero {

    public int[] countPositiveNegativeZero(int[] arr) {
        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        return new int[]{positive, negative, zero};
    }

    public static void main(String[] args) {

        CountPositiveNegativeZero obj = new CountPositiveNegativeZero();
        int[] arr = {1, -2, 0, 3, -4, 0, 5};
        int[] result = obj.countPositiveNegativeZero(arr);
        System.out.println("Count of Positive Numbers: " + result[0]);
        System.out.println("Count of Negative Numbers: " + result[1]);
        System.out.println("Count of Zeros: " + result[2]);

    }

}
