package ExceptionHandling;

// You can use multiple catch blocks to handle different types of exceptions separately. The exception that is thrown will be caught by the corresponding catch block.

public class TryWithMultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int [] numbers = {1, 2,3};
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
           } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
           } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
           } catch (Exception e) {
            System.out.println("An exception occurred");
           }
    }
}
