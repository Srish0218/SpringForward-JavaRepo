// Class with different access modifiers
class AccessModifierExample {

    // Public variable: accessible from anywhere
    public String publicVariable = "Public Variable";

    // Protected variable: accessible within the same package and subclasses
    protected String protectedVariable = "Protected Variable";

    // Private variable: accessible only within this class
    private String privateVariable = "Private Variable";

    // Default variable: accessible only within the same package
    String defaultVariable = "Default Variable";

    // Public method: accessible from anywhere
    public void displayVariables() {
        System.out.println("Accessing variables from AccessModifierExample class:");
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(privateVariable);
        System.out.println(defaultVariable);
    }
}

// Subclass in the same package to demonstrate protected and public access
class Subclass extends AccessModifierExample {
    public void displaySubclassVariables() {
        System.out.println("Accessing variables from Subclass:");
        System.out.println(publicVariable); // Accessible
        System.out.println(protectedVariable); // Accessible
        // System.out.println(privateVariable); // Not accessible (uncommenting will cause an error)
        // System.out.println(defaultVariable); // Not accessible in subclass if it's in a different package
    }
}

// Another class in the same package to demonstrate default access
class AnotherClass {
    public void displayAnotherClassVariables() {
        AccessModifierExample example = new AccessModifierExample();
        System.out.println("Accessing variables from AnotherClass:");
        System.out.println(example.publicVariable); // Accessible
        System.out.println(example.protectedVariable); // Accessible
        // System.out.println(example.privateVariable); // Not accessible (uncommenting will cause an error)
        System.out.println(example.defaultVariable); // Accessible
    }
}

// Main class to run the example
public class accessModifiers {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        // Accessing variables using an object of AccessModifierExample
        System.out.println("Accessing variables from AccessModifierTest class:");
        System.out.println(example.publicVariable); // Accessible
        System.out.println(example.protectedVariable); // Accessible
        // System.out.println(example.privateVariable); // Not accessible (uncommenting will cause an error)
        System.out.println(example.defaultVariable); // Accessible

        // Calling the displayVariables method to show all variables
        example.displayVariables();
        System.out.println();

        // Demonstrating subclass access
        Subclass subclass = new Subclass();
        subclass.displaySubclassVariables();
        System.out.println();

        // Demonstrating access from another class in the same package
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.displayAnotherClassVariables();
    }
}
