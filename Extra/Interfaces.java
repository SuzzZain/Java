package Extra;

// An interface in Java is a blueprint of a class. It contains only abstract methods (methods without a body) and constants (final variables). From Java 8 onwards, interfaces can also have default and static methods with implementation.

// An interface is implemented by classes, and a class can implement multiple interfaces (this supports multiple inheritance through interfaces).

interface Animal {
    void sound();  // Abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();  
        cat.sound();  
    }
}
