package Array;

//A multi-dimensional array (commonly 2D) is useful for representing matrices, grids, or tables.
public class MultiDimentionalArray {
    public static void main(String[] args) {
        // Creating a 2D array (matrix) of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accessing elements, matrix[][] = row and columns.
        System.out.println("Element at [1][2]: " + matrix[1][2]);  
        
        // Iterating over the 2D array using a nested for-each loop
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");  
            }
            System.out.println();  // New line after each row
        }
    }
}

