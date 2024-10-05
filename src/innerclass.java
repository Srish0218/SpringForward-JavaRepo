// Outer class declaration
class outer {
    int age;

    // Method inside the outer class
    public void show() {
        System.out.println("In show method");
    }

    // Non-static inner class declaration
    class inner {
        // Method inside the inner class
        public void config() {
            System.out.println("outer -> inner -> config");
        }
    }

    // Static inner class declaration
    static class staticInner {
        // Method inside the static inner class
        public void display() {
            System.out.println("outer -> staticInner -> display");
        }
    }
}

// Regular class
class anonClass {
    public void display() {
        System.out.println("Hi, I am in anon class display...");
    }
}

// Abstract class to be used for creating an anonymous inner class
abstract class absanonClass {
    public abstract void display();
}

// Main class to demonstrate usage of inner, static inner, and anonymous inner classes
public class innerclass {

    public static void main(String[] args) {

        // 1. Creating an object of the outer class and calling the outer class's method
        outer obj = new outer();
        obj.show(); // Output: In show method

        // 2. Creating an object of the non-static inner class
        outer.inner obj1 = obj.new inner();  // 'new inner()' is called through an outer class object 'obj'
        obj1.config(); // Output: outer -> inner -> config

        // 3. Creating an object of the static inner class
        outer.staticInner obj2 = new outer.staticInner(); // Static inner class can be accessed directly without an outer class object
        obj2.display(); // Output: outer -> staticInner -> display

        System.out.println();

        // 4. Regular object of anonClass
        anonClass ac = new anonClass();
        ac.display(); // Output: Hi, I am in anon class display...

        // 5. Creating an anonymous inner class for anonClass
        anonClass ac1 = new anonClass() {
            public void display() {
                System.out.println("Display method in anonymous class AnonClass");
            }
        };
        ac1.display(); // Output: Display method in anonymous class AnonClass

        System.out.println();

        // 6. Creating an anonymous inner class for abstract class absanonClass
        absanonClass ac2 = new absanonClass() {
            public void display() {
                System.out.println("Display method in abstract anonymous class AbsanonClass");
            }
        };

        // ac2 is an object of an anonymous class that extends absanonClass
        ac2.display(); // Output: Display method in abstract anonymous class AbsanonClass
    }
}
