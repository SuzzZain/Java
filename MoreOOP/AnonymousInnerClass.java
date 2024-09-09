package MoreOOP;

// An anonymous inner class is a class that is declared and instantiated at the same time without giving the class a name. It is commonly used when extending a class or implementing an interface.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal dog = new Animal() {  // Anonymous inner class extending Animal
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound(); 
    }
}
