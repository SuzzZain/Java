package Array;

//A jagged array is an array of arrays where each array can have different lengths.
// This is useful when dealing with structures like variable-length rows in a table.
public class JaggedArray {
    public static void main(String[] args) {
        //creating jagged array (array of arrays with different sizes)
        int[][] JaggedArray = new int[3][];
        JaggedArray[0] = new int[]{1, 2};
        JaggedArray[1] = new int[]{3, 4, 5};
        JaggedArray[2] = new int[]{6, 7, 8, 9};

        //Accessing the elements
        System.out.println("Element at [2][3]: " + JaggedArray[2][3]);

        //Iterating over the jagged array using a nested for-each loop
        System.out.println("Jagged Array Elements:");
        for(int [] row : JaggedArray){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println(); //new line after each row.
        }
    }
}
