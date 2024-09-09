package OOP;

// Method overloading occurs when multiple methods in the same class have the same name but different parameter lists (different number or types of parameters). This provides multiple ways to call a method depending on the arguments provided.

class Calculator {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));  // Calls the method with two integers
        System.out.println(calc.add(5, 10, 15));  // Calls the method with three integers
        System.out.println(calc.add(5.5, 10.5));  // Calls the method with two doubles
    }
}
