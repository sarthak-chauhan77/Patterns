/*
 * * * * *
 * * * *
 * * *
 * * 
 * 
 
 */
package Patterns;

public class ReverseRightHalfPyramid {
    ReverseRightHalfPyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new ReverseRightHalfPyramid();
    }
}