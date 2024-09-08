package String;

//A static variable is shared among all instances of a class. It belongs to the class rather than any individual object.

class Car {
    static int count = 0;  // Static variable
    String brand;

    Car(String brand) {
        this.brand = brand;
        count++;  // Incrementing the count whenever a new object is created
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");

        System.out.println("Total Cars: " + Car.count); 
    }
}
//The count variable is shared among all Car objects. Every time a new car is created, count increases.
