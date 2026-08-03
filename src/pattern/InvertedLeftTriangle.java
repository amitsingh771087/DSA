package pattern;

public class InvertedLeftTriangle {

// * * * * *
//   * * * *
//     * * *
//       * *
//         *
    public void InvertedLeftTriangle(int n) {

        for (int i = 0; i < n; i++) {

            // space
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        InvertedLeftTriangle invertedLeftTriangle = new InvertedLeftTriangle();
        invertedLeftTriangle.InvertedLeftTriangle(5);

    }

}
