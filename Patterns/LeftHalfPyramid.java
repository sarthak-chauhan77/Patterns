/*
         *
       * *
     * * *
   * * * *
 * * * * *
  
 */
package Patterns;

public class LeftHalfPyramid {
    LeftHalfPyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new LeftHalfPyramid();
    }
}