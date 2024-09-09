package Extra;

// A functional interface is an interface that contains exactly one abstract method. They can have multiple default or static methods but only one abstract method. Functional interfaces are typically used in lambda expressions.

interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.calculate(10, 20));  // Output: Sum: 30
    }
}
