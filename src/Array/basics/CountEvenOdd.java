package Array.basics;

public class CountEvenOdd {

    public int[] countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {

        CountEvenOdd obj = new CountEvenOdd();
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = obj.countEvenOdd(arr);
        System.out.println("Count of Even numbers is : " + result[0]);
        System.out.println("Count of Odd numbers is : " + result[1]);

    }

}
