package pattern;

public class Square {

// * * * *
// * * * *
// * * * *
// * * * *
    public void SquarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Square square = new Square();
        square.SquarePattern(5);

    }

}
