package MoreOOP;

// Upcasting: Converting a subclass reference into a superclass reference. This is always safe.
// Downcasting: Converting a superclass reference back into a subclass reference. This requires an explicit cast and can cause a ClassCastException if not done carefully.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


public class UpcastingDowncasting {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting (safe)
        animal.eat(); 

        Dog dog = (Dog) animal;  // Downcasting (requires explicit cast)
        dog.bark(); 
    }
}
