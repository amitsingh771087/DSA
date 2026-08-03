package pattern;

public class InvertedRightTriangle {

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
    public void InvertedRightAngleTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        InvertedRightTriangle invertedRightTriangle = new InvertedRightTriangle();
        invertedRightTriangle.InvertedRightAngleTriangle(5);

    }

}
