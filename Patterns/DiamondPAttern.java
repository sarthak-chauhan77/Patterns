package Patterns;
/* 
        *
      * * *
     * * * * *
  * * * * * * *
 * * * * * * * * *
   * * * * * * *
     * * * * *
      * * * 
        *
 */
public class DiamondPAttern {
    DiamondPAttern() {
        int rows = 5;

        // Upper part of the pattern 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // Adjust spaces for correct alignment
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern 
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) { 
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new DiamondPAttern();
    }
}
