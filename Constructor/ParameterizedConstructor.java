package Constructor;

//Parameterized Constructor: A constructor that accepts parameters to initialize the object with specific values.
class Car {
    String brand;
    int year;

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;  // 'this' refers to the current object's instance variable
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 2018);  // Calls parameterized constructor
        Car car2 = new Car("Ford", 2021);
        
        car1.displayInfo(); 
        car2.displayInfo();  
    }
}
