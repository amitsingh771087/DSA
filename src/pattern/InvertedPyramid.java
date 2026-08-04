package pattern;

public class InvertedPyramid {

    public void InvertedPyramid(int n) {

        int star = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            // Space 
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Star
            for (int j = 0; j < star; j++) {
                System.out.print("* ");

            }
            star -= 2;

            System.out.println();
        }

    }

    public static void main(String[] args) {
        InvertedPyramid invertedPyramid = new InvertedPyramid();
        invertedPyramid.InvertedPyramid(5);

    }

}
