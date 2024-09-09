package ExceptionHandling;

//The finally block contains code that is always executed after the try-catch block, regardless of whether an exception occurred or not. It is usually used to close resources such as files or database connections.

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; //will throw arithmetic exception.
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } finally {
            System.out.println("Continue code.....");
        }
    }
}
