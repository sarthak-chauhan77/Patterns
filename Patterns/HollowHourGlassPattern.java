package Patterns;

/*
             * * * * * * * * *
               *           *
                 *       *
                   *   *
                     *
                   *   *
                 *       *
               *           *
             * * * * * * * * *
 */

public class HollowHourGlassPattern {
    public static void printPattern(int rows) {
        // Upper part
        for (int i = rows; i >= 1; i--) {
            // spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // Stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = 2; i <= rows; i++) {
            // spaces
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // Stars and spaces
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows
        printPattern(rows);
    }
}
