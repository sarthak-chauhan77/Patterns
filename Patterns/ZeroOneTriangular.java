/*
 1
 0 1
 1 0 1
 0 1 0 1

 */
package Patterns;

public class ZeroOneTriangular {
    ZeroOneTriangular() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                if (j % 2 == 0)
                    System.out.print(0 + " ");
                else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new ZeroOneTriangular();
    }
}