package MoreOOP;

// Access modifiers in Java control the visibility of classes, methods, and variables. There are four types:

// Public: Accessible from any other class.
// Private: Accessible only within the class it is defined in.
// Protected: Accessible within the same package or subclasses in different packages.
// Default (Package-Private): Accessible only within the same package (no keyword).

class Animal {
    private String name;  // Private: accessible only within the class
    String type;  // Default: accessible within the package
    protected int age;  // Protected: accessible within package and subclasses
    public String color;  // Public: accessible from anywhere

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "Mammal";  // Default: Accessible within the same package
        animal.age = 5;  // Protected: Accessible because it's within the same package
        animal.color = "Brown";  // Public: Accessible from anywhere
    }
}
