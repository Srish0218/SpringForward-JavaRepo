// Define a functional interface with a parameter
@FunctionalInterface
interface funcPara {
    void display(int i);
}

// Define a functional interface for adding two numbers
@FunctionalInterface
interface addInterface {
    int add(int a, int b);
}

// Define a functional interface with a single method
@FunctionalInterface
interface func {
    void show();
}

// Class implementing the functional interface func
class func2 implements func {
    public void show() {
        System.out.println("func2 implemented by interface func");
    }
}

public class functionalInterface {
    public static void main(String[] args) {

        // Anonymous inner class implementation of func
        func f1 = new func() {
            @Override
            public void show() {
                System.out.println("Inner anonymous class for interface func");
            }
        };
        f1.show();

        System.out.println();

        // Class-based implementation of func
        func f2 = new func2();
        f2.show();

        System.out.println();

        // Lambda expression implementing func
        func f3 = () -> System.out.println("Lambda function");
        f3.show();

        System.out.println();

        // Lambda expression implementing funcPara
        funcPara fp1 = (i) -> System.out.println("Inner anonymous class for interface funcPara || " + i);
        fp1.display(11);

        System.out.println();

        // Lambda expression implementing addInterface
        addInterface aI = (a, b) -> a + b;
        int result = aI.add(2, 11);
        System.out.println("Sum: " + result);
    }
}
