// Superclass
class upper {

    // Method in the superclass
    public void uppershow() {
        System.out.println("Upper Show");
    }
}

// Subclass that extends the superclass `upper`
class lower extends upper {

    // Method in the subclass
    public void lowershow() {
        System.out.println("Lower Show");
    }
}

// Main class demonstrating upcasting and downcasting
public class MethodUpcastingDowncasting {
    public static void main(String[] args) {

        // Upcasting: creating a 'lower' object but storing it in a reference of type 'upper'
        upper obj = new lower();
        System.out.println("Calling uppershow() from upcasted object (upper reference):");
        obj.uppershow();  // Calls the uppershow() method from 'upper' class

        // Since the reference is of type 'upper', we can't call lowershow() at this point
        // obj.lowershow(); // This would give a compile-time error

        System.out.println(); // Adding space for readability

        // Downcasting: converting the 'upper' reference back into a 'lower' reference
        lower obj1 = (lower) obj;  // Downcasting the 'upper' reference to a 'lower' reference

        System.out.println("Calling lowershow() from downcasted object (lower reference):");
        obj1.lowershow();  // Now we can call the lowershow() method from 'lower' class
    }
}
