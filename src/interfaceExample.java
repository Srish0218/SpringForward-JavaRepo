//using abstraction

//abstract class Machine{
//    public abstract void code();
//}
//
//class Laptop extends Machine{
//    public void code(){
//        System.out.println("Code -> Complie -> Run             ||  in Laptop");
//    }
//}
//
//class Desktop extends Machine{
//    public void code(){
//        System.out.println("Code -> Complie -> Run             ||  in Desktop");
//    }
//}

//using interface
// Define the Machine interface with an abstract method
interface Machine {
    void code();
}

// Implement the Machine interface in the Laptop class
class Laptop implements Machine {
    public void code() {
        System.out.println("Code -> Compile -> Run || in Laptop");
    }
}

// Implement the Machine interface in the Desktop class
class Desktop implements Machine {
    public void code() {
        System.out.println("Code -> Compile -> Run || in Desktop");
    }
}

// Developer class that uses a Machine interface reference
class Developer {
    public void devApp(Machine machine) {
        machine.code(); // Polymorphism in action
    }
}

// Define interfaceA with constants and abstract methods
interface interfaceA {
    int age = 22; // public, static, and final by default
    String myName = "Srishti";
    String hisName = "Satyam";

    void show();
    void config();
}

// Define interfaceX with a constant and an abstract method
interface interfaceX {
    String running = interfaceA.hisName + " is running...";

    void run();
}

// Implement both interfaceA and interfaceX in interfaceB
class interfaceB implements interfaceA, interfaceX {
    public void show() {
        System.out.println("In interfaceB show...");
    }

    public void config() {
        System.out.println("In interfaceB config...");
    }

    public void run() {
        System.out.println("In interfaceB run...");
        System.out.println(myName + " is running...");
    }
}

// Define interfaceY that extends interfaceX, inherits its methods and constants
interface interfaceY extends interfaceX { }

// Main class to demonstrate interface usage
public class interfaceExample {
    public static void main(String[] args) {

        // Using polymorphism with interfaces
        Machine lap = new Laptop();
        Machine desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(lap); // Output: Code -> Compile -> Run || in Laptop
        dev.devApp(desk); // Output: Code -> Compile -> Run || in Desktop

        System.out.println();

        // Using interfaceA reference to call methods in interfaceB
        interfaceA obj = new interfaceB();
        obj.show(); // Output: In interfaceB show...
        obj.config(); // Output: In interfaceB config...

        System.out.println();

        // Accessing constants directly from the interface
        System.out.println("Age: " + interfaceA.age); // Output: 22
        System.out.println("My Name: " + interfaceA.myName); // Output: Srishti

        // Using interfaceX reference to call run method in interfaceB
        interfaceX obj2 = new interfaceB();
        obj2.run(); // Output: In interfaceB run... Srishti is running...
        System.out.println(interfaceX.running); // Output: Satyam is running...

        System.out.println();

        // Accessing running constant from interfaceY, inherited from interfaceX
        System.out.println(interfaceY.running); // Output: Satyam is running...
    }
}
