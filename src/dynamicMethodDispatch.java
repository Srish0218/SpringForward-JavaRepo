// Parent class (or superclass)
class first {

    // Method in the superclass
    public void show() {
        System.out.println("In first class show() method");
    }
}

// Child class (or subclass) that extends the superclass `first`
class second extends first {

    // Overriding the show() method in the subclass
    @Override
    public void show() {
        System.out.println("In second class show() method");
    }
}

// Another subclass that extends `second` (Multilevel Inheritance)
class third extends second {

    // Overriding the show() method in the third class
    @Override
    public void show() {
        System.out.println("In third class show() method");
    }
}

// Main class that demonstrates dynamic method dispatch
public class dynamicMethodDispatch {
    public static void main(String[] args) {

        // Creating an object of the superclass 'first' and calling the show() method
        first obj1 = new first();
        System.out.println("Calling show() from a first class object:");
        obj1.show();  // Calls 'first' class's show() method
        System.out.println();  // Adding space for readability

        // Creating an object of the subclass 'second' and calling the show() method
        second obj2 = new second();
        System.out.println("Calling show() from a second class object:");
        obj2.show();  // Calls 'second' class's show() method
        System.out.println();

        // Creating an object of the subclass 'third' and calling the show() method
        third obj3 = new third();
        System.out.println("Calling show() from a third class object:");
        obj3.show();  // Calls 'third' class's show() method
        System.out.println();

        // Demonstrating dynamic method dispatch
        // Here, the reference is of type 'first' but the object is of type 'second'
        first obj4 = new second();
        System.out.println("Calling show() from a reference of type first, but object of type second:");
        obj4.show();  // Calls 'second' class's show() method (runtime polymorphism)
        System.out.println();

        // Demonstrating dynamic method dispatch with a reference of type 'first' and an object of type 'third'
        first obj5 = new third();
        System.out.println("Calling show() from a reference of type first, but object of type third:");
        obj5.show();  // Calls 'third' class's show() method (runtime polymorphism)
        System.out.println();

        // Another example: Using reference of type 'second' and object of type 'third'
        second obj6 = new third();
        System.out.println("Calling show() from a reference of type second, but object of type third:");
        obj6.show();  // Calls 'third' class's show() method
    }
}
// Only words in inheritance...
// Dynamic method dispatch explanation:
        // Although obj3 is declared as 'first', it points to an object of 'second'.
        // At runtime, Java determines that obj3 actually refers to an object of 'second',
        // and calls the overridden show() method in 'second'.
