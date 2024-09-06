package Array;

//Arrays are used to store multiple values in a single variable
//A single-dimensional array is useful for storing a fixed-size collection of elements of the same type.
public class SingleDimensionalArray {
    public static void main(String[] args) {
        //creating an array of integers
        int[] numbers = new int[5];

        // int numbers[] = {10, 20, 30, 40, 50}; or
        
        // assigning the values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //Accessing the values
        System.out.println("First element: " + numbers[0]);

        //ehanced for each loop to iterate (loop) through the array
        System.out.println("All elements in the array");
        for(int num : numbers) {
            System.out.println(num + "");
        }
    }
}
