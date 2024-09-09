package OOP;

// Multilevel inheritance is when a class inherits from a parent class, and that parent class is also a subclass of another class. This forms a chain of inheritance.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {  // Mammal inherits from Animal
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class Dog extends Mammal {  // Dog inherits from Mammal (which inherited from Animal)
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.breathe();  // Inherited from Mammal
        dog.bark();  // Defined in Dog
    }
}
