/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
package Patterns;

public class RightHalfPyramid {
    RightHalfPyramid() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new RightHalfPyramid();
    }
}