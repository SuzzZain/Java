package OOP;

// this() Method:
// Used to call another constructor in the same class.
// Must be the first statement in the constructor.

class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        this("Unknown", 0);  // Calling parameterized constructor
    }

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Year: " + this.year);
    }
}

public class ThisVsSuperMethod {
    public static void main(String[] args) {
        Car car = new Car();  // Calls default constructor
        car.displayInfo();  // Output: Brand: Unknown, Year: 0
    }
}



// super() Method:
// Used to call the constructor of the superclass (parent class).
// Must be the first statement in the child class constructor.

// class Vehicle {
//     String fuel;

//     Vehicle(String fuel) {
//         this.fuel = fuel;
//     }
// }

// class Car extends Vehicle {
//     String brand;

//     Car(String brand, String fuel) {
//         super(fuel);  // Calls the constructor of the parent class (Vehicle)
//         this.brand = brand;
//     }

//     void displayInfo() {
//         System.out.println("Brand: " + this.brand + ", Fuel: " + this.fuel);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car car = new Car("Toyota", "Petrol");  // Calls Car constructor and Vehicle constructor via super()
//         car.displayInfo();  // Output: Brand: Toyota, Fuel: Petrol
//     }
// }