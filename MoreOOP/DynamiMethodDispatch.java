package MoreOOP;

// Dynamic Method Dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than at compile-time. It is achieved through method overriding and is an example of runtime polymorphism.

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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamiMethodDispatch {
    public static void main(String[] args) {
        Animal animal;  // Reference variable of parent type

        animal = new Dog();
        animal.sound(); 

        animal = new Cat();
        animal.sound(); 
    }

}
