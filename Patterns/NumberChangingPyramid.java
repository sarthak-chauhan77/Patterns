/*
 1
 2  3
 4  5  6
 7  8  9  10
 */
package Patterns;

public class NumberChangingPyramid {
    NumberChangingPyramid() {
        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new NumberChangingPyramid();
    }
}