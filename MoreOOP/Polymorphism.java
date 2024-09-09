package MoreOOP;

// Polymorphism is the ability of a method to take many forms. There are two types:

// Compile-time Polymorphism (Method Overloading): Same method name but different parameter lists.
// Runtime Polymorphism (Method Overriding): Same method name and parameter list but different implementations in subclasses.


// Compile-time Polymorphism (Overloading):

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));  // Calls the method with two parameters
        System.out.println(calc.add(5, 10, 15));  // Calls the method with three parameters
    }
}




// Runtime Polymorphism (Overriding):

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Dog();  // Upcasting: Dog treated as an Animal
//         animal.sound();  // Output: Dog barks (Runtime polymorphism)
//     }
// }