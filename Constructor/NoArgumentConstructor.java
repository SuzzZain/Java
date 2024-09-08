package Constructor;
// A constructor is a special type of method that is invoked automatically when an object of a class is created.
// It is used to initialize the newly created object and often sets initial values for the object's attributes.
// Same name as class, no return type, automatically called when object is created, can be overloaded(multiple constructor with different parameters.), 
//If no constructor is provided in a class, Java provides a default no-argument constructor.

// No-Argument Constructor: A constructor that takes no parameters. This is usually used to set default values.

class Car {
    String brand;
    int year;

    // No-argument constructor
    Car() {
        brand = "Toyota";  // Default brand
        year = 2020;       // Default year
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class NoArgumentConstructor {
    public static void main(String[] args) {
        Car car = new Car();  // Constructor is called automatically
        car.displayInfo();    // Output: Brand: Toyota, Year: 2020
    }
}
