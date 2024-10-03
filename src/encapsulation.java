class Human {

    // Static variable to keep track of the number of Human objects created
    private static int objectCount = 0;

    // Private variable - cannot be accessed directly outside this class
    private int age;

    // Public variable - can be accessed directly
    String name;

    // Private variable for surname - cannot be accessed directly outside this class
    private String surname;

    // Constructor for the Human class with all parameters
    public Human(int age, String name, String surname) {
        System.out.println("Human Constructor is called...");
        this.age = age;                // Assign passed age to the class variable
        this.name = name;              // Assign passed name to the class variable
        this.surname = surname;        // Assign passed surname to the class variable

        // Increment the object count whenever a new object is created
        objectCount++;
    }

    // Constructor for Human with age and name only
    public Human(int age, String name) {
        this(age, name, "Default"); // Calls the main constructor with a default surname
        System.out.println("Second Human Constructor is called...");
    }

    // Default constructor
    public Human() {
        this(20, "Human", "Default"); // Calls the main constructor with default values
        System.out.println("Third Human Constructor is called...");
    }

    // Getter method to retrieve the static object count
    public static int getObjectCount() {
        return objectCount; // Return the number of Human objects created
    }

    // Setter method to modify the private age variable
    public void setAge(int setted_age) {
        age = setted_age;  // Assign the passed value to the private age variable
        System.out.println("Setting age to: " + setted_age + " for " + name); // Print statement for age
    }

    // Getter method to retrieve the private age variable
    public int getAge() {
        return age;  // Return the value of the private age variable
    }

    // Setter method to modify the private surname variable
    public void setSurname(String surname) {
        this.surname = surname; // Assign the passed value to the private surname variable
        // The 'this' keyword is used here to distinguish the class variable 'surname' from the parameter 'surname'
        System.out.println("Setting surname to: " + surname + " for " + name); // Print statement for surname
    }

    // Getter method to retrieve the private surname variable
    public String getSurname() {
        return surname;  // Return the value of the private surname variable
    }
}

public class encapsulation {
    public static void main(String[] args) {
        // Creating Human objects
        Human humanDefault = new Human();
        System.out.println("Default Human: " + humanDefault.name + " " + humanDefault.getSurname() + " : " + humanDefault.getAge());
        System.out.println();  // Empty line for spacing

        Human obj1 = new Human(22, "Srishti", "Jaitly");
        System.out.println("Created Human: " + obj1.name);
//        obj1.name = "Srishti";  // Directly setting the public 'name' variable
//        obj1.setAge(22);  // Setting 'age' using the setter method
//        obj1.setSurname("Jaitly");  // Setting surname using the setter method
        System.out.println();  // Empty line for spacing

        Human obj2 = new Human(25, "Satyam");
        System.out.println("Created Human: " + obj2.name);
//        obj2.name = "Satyam";  // Directly setting the public 'name' variable
//        obj2.setAge(25);  // Setting 'age' using the setter method
//        obj2.setSurname("Pratap");  // Setting surname using the setter method
        System.out.println();  // Empty line for spacing

        // Printing the details of both Human objects
        System.out.println(obj1.name + " " + obj1.getSurname() + " : " + obj1.getAge());
        System.out.println(obj2.name + " " + obj2.getSurname() + " : " + obj2.getAge());
        System.out.println();  // Empty line for spacing

        // Creating an array of Human objects
        int totalHumans = Human.getObjectCount(); // Get the current object count
        Human[] humans = new Human[totalHumans];  // Create an array based on object count
        humans[0] = humanDefault; // Adding the default human
        humans[1] = obj1;  // Storing obj1 in the array
        humans[2] = obj2;  // Storing obj2 in the array

        // Looping through the array and printing the name and age of each Human object
        System.out.println("Printing details from the Human array:");
        for (Human hu : humans) {
            System.out.println(hu.name + " " + hu.getSurname() + " : " + hu.getAge());
        }
    }
}
