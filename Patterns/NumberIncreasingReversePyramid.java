/*
 1 2 3 4
 1 2 3 
 1 2 
 1  
  
 
 */
package Patterns;

public class NumberIncreasingReversePyramid {
    NumberIncreasingReversePyramid() {
        int rows = 4;
        int var = rows;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= var; k++) {
                System.out.print(k + " ");

            }
            var--;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new NumberIncreasingReversePyramid();
    }
}