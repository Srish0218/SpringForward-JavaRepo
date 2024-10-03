// Class that demonstrates Method Overloading in Java.
// Method Overloading allows multiple methods to have the same name but differ in parameters (by type or number).
class Calculator {

    // Instance variable (class-level variable) for storing a number
    int num = 10;

    // Method 1: Adds three integers (Overloaded method 1)
    // This method takes three integer arguments, adds them, and returns the result.
    // It also prints the value of the instance variable 'num'.
    public int add(int n1, int n2, int n3) {
        System.out.println("Instance variable num: " + num); // Printing the instance variable
        return n1 + n2 + n3; // Returning the sum of three integers
    }

    // Method 2: Adds two integers (Overloaded method 2)
    // This method takes two integer arguments, adds them, and returns the result.
    public int add(int n1, int n2) {
        return n1 + n2; // Returning the sum of two integers
    }

    // Method 3: Adds a double and an integer (Overloaded method 3)
    // This method takes a double and an integer as arguments, adds them, and returns the result as a double.
    public double add(double n1, int n2) {
        return n1 + n2; // Returning the sum of a double and an integer, result is double
    }
}

// Class representing a basic Computer
// It contains methods to perform simple tasks like playing music and getting a pen based on the cost.
class Computer {

    // Method to simulate playing music
    // This method prints a message indicating that music is being played.
    public void playMusic() {
        System.out.println("I'm playing music..."); // Output to indicate the method functionality
    }

    // Method to return a pen if the cost is sufficient
    // This method takes the cost of a pen as an argument and returns either "Pen" or "Not Enough Money!" based on the value.
    public String getMeAPen(int cost) {
        // If the cost is greater than or equal to 10, return "Pen"
        if (cost >= 10)
            return "Pen";
        else
            // Otherwise, return "Not Enough Money!"
            return "Not Enough Money!";
    }
}

public class objectOriented {
    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Calling overloaded methods from the Calculator class


        System.out.println("Method Overloading...");

        // Call the 'add' method with three integers, expecting the sum of 1, 2, and 3
        int result1 = calc.add(1, 2, 3);
        System.out.println("Sum of three integers: " + result1); // Output: 6

        // Call the 'add' method with two integers, expecting the sum of 4 and 5
        int result2 = calc.add(4, 5);
        System.out.println("Sum of two integers: " + result2); // Output: 9

        // Call the 'add' method with a double and an integer, expecting the sum of 4.5 and 6
        double result3 = calc.add(4.5, 6);
        System.out.println("Sum of a double and an integer: " + result3); // Output: 10.5

        // Creating an object of the Computer class
        Computer comp = new Computer();

        // Call the playMusic method from the Computer class
        comp.playMusic(); // Output: I'm playing music...

        // Call the getMeAPen method with different costs
        // Request a pen with a cost of 15, expecting the result "Pen"
        String pen1 = comp.getMeAPen(15);
        System.out.println("Pen request result with cost 15: " + pen1); // Output: Pen

        // Request a pen with a cost of 5, expecting the result "Not Enough Money!"
        String pen2 = comp.getMeAPen(5);
        System.out.println("Pen request result with cost 5: " + pen2); // Output: Not Enough Money!
    }
}
