// Custom Exception Class
class SrishException extends Exception {
    public SrishException(String msg){
        super(msg);
    }
}

// Class with Method using `throws`
//This means that any code calling show() must handle ClassNotFoundException, which it throws using Class.forName("SrishSatyam").

class ExceptionA {
    public void show() throws ClassNotFoundException {
        // This will throw ClassNotFoundException if class is not found
        Class.forName("SrishSatyam");
    }
}

public class exceptionHandling {
    static {
        System.out.println("Class Loaded...");
    }

    public static void main(String[] args) {

        // Simple try-catch block to handle ClassNotFoundException
        try {
            Class.forName("exceptionHandling");
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }

        int i = 2;  // Change to 0 to test ArithmeticException
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i;  // Might throw ArithmeticException
            System.out.println(str.length());  // Will throw NullPointerException
            System.out.println(nums[1]);  // Access valid index
            System.out.println(nums[5]);  // Will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        } catch (Exception e) {  // Catch-all for other exceptions like NullPointerException
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye");

        // Using `throw` to throw custom exception
        int m = 20;
        int n = 0;
        try {
            n = 18 / m;
            if (n == 0) {
                n = 18;
                throw new SrishException("n is equal to 0 so printing default value.");
            }
        } catch (SrishException se) {
            System.out.println("Caught SrishException: " + se.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println(n);

        // Handling ClassNotFoundException thrown by `show()` in `ExceptionA`
        ExceptionA ex = new ExceptionA();
        try {
            ex.show();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }

        System.out.println();

        //using a finally block, which is executed regardless of whether an exception is thrown or not. This is useful for cleanup tasks, like closing resources.

        int sr = 2;
        int sa = 0;

        try {
            sa = 18/sr;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }
        finally {
            System.out.println("Finally");

        }
    }
}
