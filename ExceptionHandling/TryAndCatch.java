package ExceptionHandling;

// Exception handling in Java allows developers to handle runtime errors or abnormal events in a structured and organized manner, preventing abrupt termination of the program.

// The try-catch block is used to handle exceptions that might occur during the execution of a block of code. The code that might throw an exception is placed inside the try block, and the catch block handles the specific exceptions.
public class TryAndCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // will throw Arithemetic exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero!");
        }
        System.out.println("Code Continues....");
    }
}
