//Class: A blueprint from which individual objects are created. A class contains fields (attributes) and methods (functions).
class Description {
    String name;
    int age;
    String occupation;

    // methods are blocks of code that perform a specific task. They are used to implement the behavior of objects,
    // modularize code, and promote reusability. Methods can accept input parameters, execute a set of instructions, and optionally return a value.
    public void Describe() {
        System.out.println("My name is " + name + ". " + "My age is " + age + ". " + "My occupation is " + occupation + ".");
    }
}

public class Variable {
    public static void main(String[] args) {
        //Object: An instance of a class. Objects interact with each other through methods.
        Description person = new Description();
        person.name = "Sujen";
        person.age = 26;
        person.occupation = "Junior Devops and Backend";
        person.Describe();
    }
}

