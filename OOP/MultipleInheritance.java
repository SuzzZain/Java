package OOP;

// Java does not support multiple inheritance with classes to avoid ambiguity (the Diamond Problem) when two parent classes have methods with the same signature. However, Java allows multiple inheritance with interfaces.

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {  // Multiple inheritance through interfaces
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Implemented from Animal
        dog.play();  // Implemented from Pet
    }
}
