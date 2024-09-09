package ExceptionHandling;

// throw: Used to explicitly throw an exception.

public class ThrowExample {
    public static void validateAge(int age) {
        if(age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        validateAge(15);
    }
}
