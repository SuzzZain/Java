package OOP;

// The this keyword refers to the current object. It is often used to differentiate between instance variables and parameters that have the same name, or to invoke other constructors or methods within the same class.
// The this keyword is used to refer to the current object’s instance variables (brand and year), differentiating them from the constructor parameters.
class Car {
    String brand;
    int year;

    // Constructor using 'this' to differentiate between instance variable and parameter
    Car(String brand, int year) {
        this.brand = brand;  // 'this.brand' refers to the instance variable, 'brand' refers to the parameter
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + this.brand + ", Year: " + this.year);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);  // Creating object using constructor
        car.displayInfo(); 
    } 
}
