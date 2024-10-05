import static java.lang.Math.abs;

class A {
    // Default constructor of class A
    public A() {
        super(); // Calls the constructor of Object (parent class of all Java classes)
        System.out.println("A default constructor is called (Base class in Single Inheritance).");
    }

    // Parameterized constructor of class A
    public A(int a) {
        super();
        System.out.println("A parameterized constructor is called with value: " + a + " (Base class in Single Inheritance).");
    }
}

class B extends A {
    // Default constructor of class B
    public B() {
        super(2); // Explicitly calling parameterized constructor of class A
        System.out.println("B default constructor is called (Derived class in Single Inheritance).");
    }

    // Parameterized constructor of class B
    public B(int a) {
        this(); // Calls B's default constructor first
        System.out.println("B parameterized constructor is called with value: " + a + " (Derived class in Single Inheritance).");
    }
}

// Single inheritance between Calc -> AdcCalc
class Calc {
    public int add(int a, int b) {
        System.out.println("Performing addition (Base class in Multilevel Inheritance): " + a + " + " + b);
        return a + b;
    }

    public int sub(int a, int b) {
        System.out.println("Performing subtraction (Base class in Multilevel Inheritance): " + a + " - " + b);
        return abs(a - b);
    }
}

class AdcCalc extends Calc {
    public int multi(int a, int b) {
        System.out.println("Performing multiplication (Intermediate class in Multilevel Inheritance): " + a + " * " + b);
        return a * b;
    }

    public int div(int a, int b) {
        System.out.println("Performing division (Intermediate class in Multilevel Inheritance): " + a + " / " + b);
        return a / b;
    }
}

// Multilevel inheritance: Calc -> AdcCalc -> ScientificCalc
class ScientificCalc extends AdcCalc {
    public double power(int a, int b) {
        System.out.println("Calculating power (Derived class in Multilevel Inheritance): " + a + "^" + b);
        return Math.pow(a, b);
    }
}

// Hierarchical inheritance: HA -> HB, HA -> HC
class HA {
    void display() {
        System.out.println("Display method in class HA (Base class in Hierarchical Inheritance).");
    }
}

class HB extends HA {
    void show() {
        System.out.println("Show method in class HB (Derived class in Hierarchical Inheritance).");
    }
}

class HC extends HA {
    void print() {
        System.out.println("Print method in class HC (Derived class in Hierarchical Inheritance).");
    }
}

class Aa {
    public void show() {
        System.out.println("Hi, I am in Aa show...");
    }

    public void config() {
        System.out.println("Hi, I am in Aa config...");
    }
}

class Bb extends Aa {
    // overriding methods
    public void show() {
        System.out.println("Hi, I am in Bb show...");
    }
}



// Testing various inheritance types
public class inheritence {
    public static void main(String[] args) {
        // Demonstrating Single Inheritance
        System.out.println("Demonstrating Single Inheritance:");
        B obj = new B(11); // Calls B's parameterized constructor
        System.out.println();

        // Demonstrating Multilevel Inheritance
        System.out.println("Demonstrating Multilevel Inheritance:");
        ScientificCalc calc = new ScientificCalc();
        int r1 = calc.add(10, 20); // Calls Calc class method
        System.out.println("Addition result: " + r1);
        System.out.println();

        int r2 = calc.sub(10, 20); // Calls Calc class method
        System.out.println("Subtraction result: " + r2);
        System.out.println();

        int r3 = calc.div(10, 20); // Calls AdcCalc class method
        System.out.println("Division result: " + r3);
        System.out.println();

        int r4 = calc.multi(10, 20); // Calls AdcCalc class method
        System.out.println("Multiplication result: " + r4);
        System.out.println();

        double r5 = calc.power(10, 2); // Calls ScientificCalc class method
        System.out.println("Power result: " + r5);
        System.out.println();

        // Demonstrating Hierarchical Inheritance
        System.out.println("Demonstrating Hierarchical Inheritance:");
        HB objB = new HB();
        objB.display(); // Inherited from HA
        objB.show();    // Specific to HB

        HC objC = new HC();
        objC.display(); // Inherited from HA
        objC.print();   // Specific to HC
        System.out.println();

        // Demonstrating Method Overriding
        System.out.println("Method Overriding:");
        Aa a = new Aa();
        a.show();   // Calls Aa's show method
        a.config(); // Calls Aa's config method
        System.out.println();

        Bb b = new Bb();
        b.show();   // Calls Bb's show method
        b.config(); // Calls Aa's config method (inherited by Bb)

        System.out.println();



    }
}

