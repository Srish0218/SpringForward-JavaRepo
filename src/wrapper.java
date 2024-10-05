import java.util.ArrayList;

public class wrapper {

    public static void main(String[] args) {

        // 1. Basic Autoboxing and Unboxing
        System.out.println("=== 1. Basic Autoboxing and Unboxing ===");
        int a = 10;
        Integer aWrapper = a;  // Autoboxing
        System.out.println("Autoboxed Integer: " + aWrapper);

        Integer bWrapper = 20;
        int b = bWrapper;  // Auto-unboxing
        System.out.println("Auto-unboxed int: " + b);
        System.out.println();

        // 2. Conversion between Wrapper Classes
        System.out.println("=== 2. Conversion between Wrapper Classes ===");
        Integer intObj = 42;
        Double doubleObj = intObj.doubleValue();  // Converts Integer to Double
        System.out.println("Converted Integer to Double: " + doubleObj);

        Double d = 15.5;
        Float f = d.floatValue();  // Converts Double to Float
        System.out.println("Converted Double to Float: " + f);
        System.out.println();

        // 3. String to Wrapper Conversion and Vice Versa
        System.out.println("=== 3. String to Wrapper Conversion and Vice Versa ===");
        String str = "123";
        Integer intValue = Integer.valueOf(str);  // Parsing String to Integer
        System.out.println("String to Integer: " + intValue);

        Integer num = 456;
        String numStr = num.toString();  // Converting Integer to String
        System.out.println("Integer to String: " + numStr);

        String doubleStr = "3.1415";
        Double doubleValue = Double.parseDouble(doubleStr);  // Parsing String to Double
        System.out.println("Parsed Double from String: " + doubleValue);
        System.out.println();

        // 4. Wrapper Class Constants and Utility Methods
        System.out.println("=== 4. Wrapper Class Constants and Utility Methods ===");
        System.out.println("Max Integer value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer value: " + Integer.MIN_VALUE);

        Integer num1 = 100;
        Integer num2 = 200;
        int result = num1.compareTo(num2);  // Compares two Integers
        System.out.println("Result of comparing num1 and num2: " + result);

        Double doubleNaN = Double.NaN;
        System.out.println("Is NaN: " + doubleNaN.isNaN());
        System.out.println();

        // 5. Autoboxing in Collections
        System.out.println("=== 5. Autoboxing in Collections ===");
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);  // Autoboxing
        numList.add(10);

        int firstNum = numList.get(0);  // Auto-unboxing
        System.out.println("First number in the list: " + firstNum);
        System.out.println("All numbers in the list: " + numList);
        System.out.println();

        // 6. Boolean Wrapper Class Example
        System.out.println("=== 6. Boolean Wrapper Class Example ===");
        Boolean bool1 = Boolean.valueOf(true);   // Boolean object
        Boolean bool2 = Boolean.valueOf("false"); // Parsing String to Boolean

        System.out.println("Boolean 1: " + bool1);
        System.out.println("Boolean 2: " + bool2);

        boolean primitiveBool = bool1;  // Auto-unboxing
        System.out.println("Primitive boolean: " + primitiveBool);
        System.out.println();

        // 7. parseXxx() Methods for Wrapper Classes
        System.out.println("=== 7. parseXxx() Methods for Wrapper Classes ===");
        String strNum = "100";
        int parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed int from string: " + parsedInt);

        String floatStr = "12.34";
        float parsedFloat = Float.parseFloat(floatStr);
        System.out.println("Parsed float from string: " + parsedFloat);

        String boolStr = "true";
        boolean parsedBool = Boolean.parseBoolean(boolStr);
        System.out.println("Parsed boolean from string: " + parsedBool);
        System.out.println();

        // 8. equals() in Wrapper Classes
        System.out.println("=== 8. equals() in Wrapper Classes ===");
        Integer num3 = 100;
        Integer num4 = 100;
        Integer num5 = 200;

        System.out.println("Is num3 equal to num4? " + num3.equals(num4));  // true
        System.out.println("Is num3 equal to num5? " + num3.equals(num5));  // false

        Boolean bool3 = true;
        Boolean bool4 = Boolean.valueOf("true");
        System.out.println("Are bool3 and bool4 equal? " + bool3.equals(bool4));  // true
    }
}
