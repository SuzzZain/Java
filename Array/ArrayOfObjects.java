package Array;

class Student {
    String name;
    int age;

    //A constructor is a special type of method that is invoked automatically when an object of a class is created.
    // It is used to initialize the newly created object and often sets initial values for the object's attributes.
    //It has same name as class, does not have return type not even void, can have multiple constructors with different parameters
    // Types of Constructors:
    //     No-Argument Constructor: A constructor that takes no parameters. This is usually used to set default values.
    //     Parameterized Constructor: A constructor that accepts parameters to initialize the object with specific values.
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to display student details
    void displayInfo(){
        System.out.println("Name: " + name + ", " + "Age: " + age);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        //Creating an array of Student Objects
        Student[] students = new Student[3];

        //Creating and assigning student objects
        students[0] = new Student("John", 20);
        students[1] = new Student("Alice", 22);
        students[2] = new Student("Bob", 21);

        //Accessing and displaying student information
        //Iterating through Student array using enhanced for each loop.
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
