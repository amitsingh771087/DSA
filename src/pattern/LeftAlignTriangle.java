package pattern;

public class LeftAlignTriangle {

    public void LeftAlignTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Star
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        LeftAlignTriangle leftAlignTriangle = new LeftAlignTriangle();
        leftAlignTriangle.LeftAlignTriangle(5);

    }

}
