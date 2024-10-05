// Abstract class Car with one abstract method 'drive', one abstract method 'flu', and one concrete method 'playMusic'
abstract class Car {

    // Abstract method: Must be implemented by any subclass of Car
    public abstract void drive();

    // Concrete method: Common functionality available to all subclasses
    public void playMusic() {
        System.out.println("Car plays music");
    }

    // Abstract method: Must be implemented by subclasses
    public abstract void flu();
}

// Subclass of Car that provides implementation of abstract methods
class SatyamCar extends Car {

    // Implementing the abstract method 'drive'
    public void drive() {
        System.out.println("Satyam car is driving");
    }

    // Implementing the abstract method 'flu'
    public void flu() {
        System.out.println("Satyam car flu");
    }
}

// Main class to demonstrate abstraction
public class abstraction {

    public static void main(String[] args) {

        // Creating an object of SatyamCar but referencing it as type Car (demonstrating abstraction)
        Car car = new SatyamCar();

        // Calling the implemented 'drive' method in SatyamCar
        car.drive();

        // Calling the non-abstract 'playMusic' method from the abstract Car class
        car.playMusic();

        // Optionally, call the 'flu' method if desired
        car.flu();
    }
}
