package OOP;

// Getter and setter methods are used to access and modify the private instance variables of a class. This is part of the encapsulation principle, where direct access to data is restricted.
// Getters (getName(), getAge()) are used to access the private fields.
// Setters (setName(), setAge()) are used to modify the private fields.
// The private fields name and age are hidden, ensuring data encapsulation.

class Person {
    // Private variables (encapsulation)
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // 'this' refers to the current object's instance variable
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {  // Validation logic
            this.age = age; // 'this' is used to differentiate between parameter and instance variable
        }
    }

    
}

public class GetterSetter {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");  // Setting values using setters
        person.setAge(25);

        System.out.println("Name: " + person.getName());  // Accessing values using getters
        System.out.println("Age: " + person.getAge());
    }
}
