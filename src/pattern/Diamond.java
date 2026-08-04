package pattern;

public class Diamond {

    public void Diamond(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            int row;

            // Find the current logical row
            if (i < n) {
                row = i;
            } else {
                row = 2 * n - 2 - i;
            }

            // Print spaces
            for (int j = 0; j < n - row - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * row + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.Diamond(5);
    }
}
