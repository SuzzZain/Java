package OOP;

// Inheritance is a key feature in object-oriented programming (OOP) that allows one class (called the subclass or child class) to inherit properties and behaviors (fields and methods) from another class (called the superclass or parent class).
// Single inheritance is when a class inherits from a single parent class. The subclass derives its properties and methods from one superclass.

class Vehicle {
    String fuelType;

    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {  // Car is inheriting from Vehicle
    String brand;

    public void displayInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Fuel type: " + fuelType);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car car = new Car();  // Create a Car object
        car.fuelType = "Petrol";  // Inherited from Vehicle
        car.brand = "Toyota";  // Specific to Car
        car.start();  // Inherited from Vehicle
        car.displayInfo();  // Specific to Car
    }
}
