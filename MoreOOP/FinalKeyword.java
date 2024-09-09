package MoreOOP;

// The final keyword can be applied to classes, methods, and variables to indicate that they cannot be modified.

// Final class: Cannot be subclassed.
// Final method: Cannot be overridden.
// Final variable: Its value cannot be changed once initialized.

final class Animal {
    final String species = "Mammal";

    final void display() {
        System.out.println("Animal species: " + species);
    }
}

// class Dog extends Animal {}  // This would cause an error, since Animal is final


public class FinalKeyword {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.display();
    }
}
