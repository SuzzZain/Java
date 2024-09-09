package Extra;

// An annotation provides metadata about the program but has no direct impact on the execution. Common built-in annotations include @Override, @Deprecated, and @SuppressWarnings.

class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    @Override  // Annotation to indicate method overriding
    void display() {
        System.out.println("Child class display method");
    }
}

public class Annotations {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); 
    }
}
