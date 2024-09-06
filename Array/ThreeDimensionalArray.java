package Array;

//A 3D array is useful for representing data in 3 dimensions, such as a 3D grid or multiple matrices.
public class ThreeDimensionalArray {
    public static void main(String[] args) {
        //Creating 3D array (cube)
        int [][][] ThreeDimensionalArray = new int[2][2][3];
        ThreeDimensionalArray[0][0][0] = 1;
        ThreeDimensionalArray[0][0][1] = 2;
        ThreeDimensionalArray[0][0][2] = 3;
        ThreeDimensionalArray[0][1][0] = 4;
        ThreeDimensionalArray[0][1][1] = 5;
        ThreeDimensionalArray[0][1][2] = 6;
        ThreeDimensionalArray[1][0][0] = 7;
        ThreeDimensionalArray[1][0][1] = 8;
        ThreeDimensionalArray[1][0][2] = 9;
        ThreeDimensionalArray[1][1][0] = 10;
        ThreeDimensionalArray[1][1][1] = 11;
        ThreeDimensionalArray[1][1][2] = 12;

        //Accessing the elements
        System.out.println("Element at [1][1][1]:" + ThreeDimensionalArray[1][1][1]);

        //Iterating over the 3D array using a nested for-each loop
        System.out.println("Elements in the Three Dimensional Array: ");
        for (int[][] matrix : ThreeDimensionalArray){
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
