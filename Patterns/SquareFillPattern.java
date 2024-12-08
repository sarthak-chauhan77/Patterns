package Patterns;
/*
       * * * * * * 
       * * * * * * 
       * * * * * * 
       * * * * * * 
       * * * * * * 
       * * * * * * 
 */
public class SquareFillPattern {
    SquareFillPattern() {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new SquareFillPattern();
    }
}
