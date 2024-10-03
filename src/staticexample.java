class Mobile {
    // Instance variables (specific to each Mobile object)
    String brand;
    int price;
    String model;

    // Static variable - shared by all instances of the class (obj)
    static String colour = "BLACK by static";  // This is a class-level attribute, common for all objects of the class

    // Static block - executed when the class is loaded into memory (before any objects are created)
    static {
        // Modifying the static variable inside the static block
        colour = "RED by static block";
        System.out.println("Inside static block: Static block is executed when the class is loaded.");
    }

    // Constructor - called when an object of the class is created
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("Inside constructor: Constructor block is executed each time an object is created.");
    }

    // Instance method - can access both static and non-static members
    public void show() {
        System.out.println("Inside show method: " + brand + " " + price + " " + model + " " + colour);
    }

    // Static method - can access only static variables (but can take object as parameter to access instance variables)
    public static void display(Mobile obj) {
        System.out.println("Inside static display method: " + obj.brand + " " + obj.price + " " + obj.model + " " + colour);
    }
}

public class staticexample {
    public static void main(String[] arg) {
        // Creating first Mobile object
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";  // Assigning instance-specific values
        obj1.price = 150000;
        obj1.model = "iPhone 15";

        // Creating second Mobile object
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";  // Assigning instance-specific values
        obj2.price = 50000;
        obj2.model = "S24 Ultra";

        // Creating an array of Mobile objects
        Mobile mobile[] = new Mobile[2];
        mobile[0] = obj1;  // Storing obj1 in array
        mobile[1] = obj2;  // Storing obj2 in array

        System.out.println();

        // Looping through the array and printing the values
        System.out.println("Printing Mobile objects using a loop:");
        for (Mobile mob : mobile) {
            // Accessing static variable (Mobile.colour) and instance variables
            System.out.println(mob.brand + " " + mob.price + " " + mob.model + " " + Mobile.colour);
        }
        System.out.println();  // Empty line for spacing

        // Calling the instance method show() for obj1 and obj2, which prints instance and static values
        System.out.println("Printing details using instance show() method for obj1 and obj2:");
        obj1.show();
        obj2.show();

        System.out.println();  // Empty line for spacing

        // Calling the static method display() for obj1 and obj2, passing objects as arguments
        System.out.println("Printing details using static display() method for obj1 and obj2:");
        Mobile.display(obj1);
        Mobile.display(obj2);
    }
}
