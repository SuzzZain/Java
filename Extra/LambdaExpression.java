package Extra;

// Lambda expressions provide a concise way to represent an anonymous function (i.e., a method without a name) that can be passed around. They are primarily used to implement functional interfaces.
// Lambda expressions simplify the code for functional interfaces.
// They are used to implement the single abstract method of a functional interface.

interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Calculator multiply = (a, b) -> a * b;  // Lambda expression to multiply two numbers
        System.out.println("Multiplication: " + multiply.calculate(5, 3));  // Output: 15
    }
}


// If a lambda expression contains more than one statement, you need to enclose them in curly braces {} and explicitly use the return keyword.
// @FunctionalInterface
// interface Calculator {
//     int calculate(int a, int b);
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator addition = (a, b) -> {
//             int result = a + b;
//             return result;
//         };
//         System.out.println("Addition: " + addition.calculate(10, 5));  // Output: 15
//     }
// }
