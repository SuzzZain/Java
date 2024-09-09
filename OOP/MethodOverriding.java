package OOP;

// Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its parent class. The method in the child class must have the same signature (method name, return type, and parameters) as the one in the parent class.

// @Override annotation is used to ensure a method is correctly overridden.
// The method in the child class should have the same name and parameter list as the method in the parent class.
// Only instance methods (non-static methods) can be overridden.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks (overridden method)
    }
}
