package Patterns;
/*
          1   
         212  
        32123 
       4321234
 */
public class PalindromeTriangular {
    PalindromeTriangular() {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new PalindromeTriangular();
    }
}
