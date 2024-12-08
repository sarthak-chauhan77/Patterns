package Patterns;

/*
           1
          1 1
         1 2 1        
        1 3 3 1       
       1 4 6 4 1      
      1 5 10 10 5 1   
     1 6 15 20 15 6 1 
 */
public class PascalsTriangle {
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int value = 1; // Starting value
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                // Update value using the binomial coefficient formula
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 7; // Number of rows for Pascal's Triangle
        printPascalsTriangle(rows);
    }
}
