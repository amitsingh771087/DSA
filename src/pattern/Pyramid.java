package pattern;

public class Pyramid {

    public void Pyramid(int n) {
        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.Pyramid(5);

    }

}
