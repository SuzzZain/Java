package MoreOOP;

// An abstract class is a class that cannot be instantiated. It may contain abstract methods (methods without a body) that must be implemented by any concrete subclass.

abstract class Animal {
    abstract void sound();  // Abstract method

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassAndMethods {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); 
        dog.eat();  
    }
}
