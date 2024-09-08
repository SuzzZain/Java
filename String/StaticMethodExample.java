package String;

//A static method belongs to the class, not to an instance of the class. It can be called without creating an object of the class, and it can only access static variables.

class MathOperations {
    static int add(int a, int b) {
        return a + b;  // Static method
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int sum = MathOperations.add(5, 10);  // Calling the static method without creating an object
        System.out.println("Sum: " + sum);  
    }
}
