/*
       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5
  
 */
package Patterns;

public class NumberTriangular {
    NumberTriangular() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new NumberTriangular();
    }
}