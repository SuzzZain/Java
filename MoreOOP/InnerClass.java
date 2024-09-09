package MoreOOP;

// An inner class is a class defined within another class. It can access the members (including private members) of the outer class.

class Outer {
    private String message = "Hello, World!";

    class Inner {
        void displayMessage() {
            System.out.println(message);  // Accessing private member of outer class
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.displayMessage(); 
    }
}
