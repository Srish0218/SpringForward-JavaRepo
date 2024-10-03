class Main {

    public static void main(String[] args) {
        // Call functions to display topics
        displayDataTypes();
        displayLiterals();
        displayAssignmentOperators();
        demonstrateIncrementDecrement();
        displayRelationalOperators();
        displayBitwiseAndLogicalOperators();
        displayTypeCasting();
        TypePromotion();
        conditional_statement();
    }

    public static void displayDataTypes() {
        System.out.println("Declaring and initializing various data types");
        int num1 = 3;                // Integer type
        int num2 = 5;                // Integer type
        float num = 3.5f;            // Floating-point type (single precision)
        double num3 = 3.5;           // Floating-point type (double precision)
        char c = 'S';                // Character type
        byte by = 127;               // Byte type (range: -128 to 127)
        long lng = 123456789L;       // Long type
        boolean ans = true;          // Boolean type
        short sh = 32000;            // Short type (range: -32,768 to 32,767)
        String str = "Hello World";  // String type (not a primitive type but commonly used)
        double num4 = 12.34e2;       // Scientific notation (double precision)

        // Printing all the values
        System.out.println("Integer num1: " + num1);
        System.out.println("Integer num2: " + num2);
        System.out.println("Float num: " + num);
        System.out.println("Double num3: " + num3);
        System.out.println("Char c: " + c);
        System.out.println("Byte by: " + by);
        System.out.println("Long lng: " + lng);
        System.out.println("Boolean ans: " + ans);
        System.out.println("Short sh: " + sh);
        System.out.println("String str: " + str);
        System.out.println("Scientific notation double num4: " + num4);

        System.out.println("----------------------------------------------------");
    }

    public static void displayLiterals() {
        System.out.println("Declaring and initializing various data types with different literals");

        // Integer literals
        int dec = 10;                // Decimal literal (base 10)
        int hex = 0x1A;              // Hexadecimal literal (base 16)
        int oct = 012;               // Octal literal (base 8)
        int bin = 0b1010;            // Binary literal (base 2)

        // Floating-point literals
        float floatLiteral = 10.5f;  // Float literal with 'f' suffix
        double doubleLiteral = 10.5; // Double literal (default for floating-point numbers)
        double sci = 1.23e2;         // Scientific notation (1.23 * 10^2)

        // Character and String literals
        char charLiteral = 'A';      // Character literal
        char unicodeLiteral = '\u0041'; // Unicode literal (A)
        String strr = "Hello World";  // String literal

        // Boolean literals
        boolean trueLiteral = true;  // Boolean literal true
        boolean falseLiteral = false; // Boolean literal false

        // Printing all the values
        System.out.println("Decimal literal: " + dec);
        System.out.println("Hexadecimal literal: " + hex);
        System.out.println("Octal literal: " + oct);
        System.out.println("Binary literal: " + bin);
        System.out.println("Float literal: " + floatLiteral);
        System.out.println("Double literal: " + doubleLiteral);
        System.out.println("Scientific notation: " + sci);
        System.out.println("Character literal: " + charLiteral);
        System.out.println("Unicode character literal: " + unicodeLiteral);
        System.out.println("String literal: " + strr);
        System.out.println("Boolean literal (true): " + trueLiteral);
        System.out.println("Boolean literal (false): " + falseLiteral);

        System.out.println("----------------------------------------------------");
    }

    public static void displayAssignmentOperators() {
        System.out.println("Assignment operators. ");
        int num1 = 7;
        int num2 = 5;


        // Basic arithmetic operations
        System.out.println("Basic arithmetic operations.");
        int add = num1 + num2; // Addition
        int sub = num1 - num2; // Subtraction
        int mul = num1 * num2; // Multiplication
        int div = num1 / num2; // Division
        int mod = num1 % num2; // Modulus (remainder)

        // Printing results of arithmetic operations
        System.out.println("Addition (num1 + num2): " + add);
        System.out.println("Subtraction (num1 - num2): " + sub);
        System.out.println("Multiplication (num1 * num2): " + mul);
        System.out.println("Division (num1 / num2): " + div);
        System.out.println("Modulus (num1 % num2): " + mod);

        // Compound assignment operators
        System.out.println("Compound assignment operators.");
        num1 += 2; // Equivalent to num1 = num1 + 2
        num2 -= 2; // Equivalent to num2 = num2 - 2

        // Printing results after compound assignment
        System.out.println("num1 after adding 2 (num1 += 2): " + num1);
        System.out.println("num2 after subtracting 2 (num2 -= 2): " + num2);

        // Post-increment operation
        System.out.println("Post-increment operation.");
        int postIncrement = num1++;
        System.out.println("Value of postIncrement (num1++): " + postIncrement);
        System.out.println("Value of num1 after postIncrement: " + num1);

        // Pre-increment operation
        System.out.println("Pre-increment operation.");
        int preIncrement = ++num1;
        System.out.println("Value of preIncrement (++num1): " + preIncrement);
        System.out.println("Value of num1 after preIncrement: " + num1);

        System.out.println("----------------------------------------------------");
    }

    public static void demonstrateIncrementDecrement() {
        int num1 = 5;

        // Pre-increment example
        int result1 = ++num1; // num1 is incremented first, then assigned to result1
        System.out.println("After pre-increment (++num1):");
        System.out.println("num1 is incremented first, then assigned to result1.");
        System.out.println("Value of num1: " + num1);   // Output: 6
        System.out.println("Value of result1: " + result1); // Output: 6
        System.out.println();

        // Post-decrement example
        int num2 = 5;
        int result2 = num2++; // result2 is assigned the value of num2, then num2 is decremented
        System.out.println("\nAfter post-decrement (num2++):");
        System.out.println("result2 is assigned the value of num2, then num2 is decremented.");
        System.out.println("Value of num2: " + num2);   // Output: 4
        System.out.println("Value of result2: " + result2); // Output: 5

        System.out.println("----------------------------------------------------");

    }

    public static void displayRelationalOperators() {
        System.out.println("Relational operators:");

        int x = 6;
        int y = 5;

        // Less than
        boolean result1 = x < y;
        System.out.println("Result of (x < y): " + result1); // Output: false

        // Greater than
        boolean result2 = x > y;
        System.out.println("Result of (x > y): " + result2); // Output: true

        // Less than or equal to
        boolean result3 = x <= y;
        System.out.println("Result of (x <= y): " + result3); // Output: false

        // Greater than or equal to
        boolean result4 = x >= y;
        System.out.println("Result of (x >= y): " + result4); // Output: true

        // Equal to
        boolean result5 = x == y;
        System.out.println("Result of (x == y): " + result5); // Output: false

        // Not equal to
        boolean result6 = x != y;
        System.out.println("Result of (x != y): " + result6); // Output: true
        System.out.println("----------------------------------------------------");

    }

    public static void displayBitwiseAndLogicalOperators() {
        System.out.println("Bitwise and Logical operators:");

        int x = 6;  // Binary: 110
        int y = 5;  // Binary: 101

        // Bitwise AND (&)
        int bitwiseAndResult = x & y; // Result: 100 (Binary) = 4 (Decimal)
        System.out.println("Bitwise AND (x & y): " + bitwiseAndResult);
        System.out.println("Explanation: Bitwise AND compares each bit of both operands. If both bits are 1, the corresponding result bit is set to 1.");

        // Bitwise OR (|)
        int bitwiseOrResult = x | y; // Result: 111 (Binary) = 7 (Decimal)
        System.out.println("Bitwise OR (x | y): " + bitwiseOrResult);
        System.out.println("Explanation: Bitwise OR compares each bit of both operands. If at least one bit is 1, the corresponding result bit is set to 1.");

        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean logicalAndResult = a && b; // Result: false
        System.out.println("Logical AND (a && b): " + logicalAndResult);
        System.out.println("Explanation: Logical AND returns true only if both operands are true. It also performs short-circuiting.");

        // Logical OR (||)
        boolean logicalOrResult = a || b; // Result: true
        System.out.println("Logical OR (a || b): " + logicalOrResult);
        System.out.println("Explanation: Logical OR returns true if at least one operand is true. It also performs short-circuiting.");

        // Using & and | with boolean values (without short-circuiting)
        boolean bitwiseAndWithBooleans = a & b; // Result: false
        System.out.println("Bitwise AND with booleans (a & b): " + bitwiseAndWithBooleans);
        System.out.println("Explanation: Bitwise AND with booleans behaves similarly to logical AND but without short-circuiting.");

        boolean bitwiseOrWithBooleans = a | b; // Result: true
        System.out.println("Bitwise OR with booleans (a | b): " + bitwiseOrWithBooleans);
        System.out.println("Explanation: Bitwise OR with booleans behaves similarly to logical OR but without short-circuiting.");
        System.out.println("----------------------------------------------------");

    }

    public static void displayTypeCasting() {
        int a = 12;
        byte k = (byte) a;
        System.out.println("Original int value 'a' = " + a + ". After casting to byte, 'k' = " + k);
        System.out.println();

        float f = 5.6f;
        int fl = (int) f;

        System.out.println("Original float value 'a' = " + a + ". After casting to int, 'k' = " + k);
        System.out.println("Without casting there was lossy conversion.");
        System.out.println();

        int b = 257;
        byte c = (byte) b;
        System.out.println("Original int value 'b' = " + b);

        // Explaining the modulus logic:
        System.out.println("The range of a byte is from -128 to 127, i.e., 256 distinct values.");
        System.out.println("'b % 256' = " + (b % 256) + " (this is the result of the modulus operation , byte value=int value%256).");

        // Printing the result after casting
        System.out.println("After casting 'b' to byte, the value of 'c' is: " + c);
        System.out.println("----------------------------------------------------");
    }

    public static void TypePromotion() {
        byte a = 10;
        byte b = 2;

        int result = a * b;
        System.out.println("Byte a = " + a + " and Byte b = " + b);
        System.out.println("Final result: " + result);

        System.out.println("Explanation: Java automatically promotes byte, short, and char to int, then promotes smaller data types to the largest type in the expression, which is double in this case.");

        System.out.println("----------------------------------------------------");

    }

    public static void conditional_statement() {

        System.out.println("If-else Loop:- ");
        int x = 8;

        if (x > 10) {
            System.out.println(x + " is greater than 10");
        } else {
            System.out.println(x + " is less than 10");
        }

        if (x > 10 && x <= 20) {
            System.out.println(x + " is between 11 and 20");
        } else {
            System.out.println(x + " is not between 11 and 20");
        }

        int y = 9;
        if (x > y) {
            System.out.println(x + " is greater than y " + y);
        } else {
            System.out.println(x + " is less than y " + y);
        }
        System.out.println();

        int a = 8;
        int b = 7;
        int c = 6;

        if (a > b && a > c) {
            System.out.println("X is greatest number");
        } else if (b > c) {
            System.out.println("Y is greatest number");
        } else {
            System.out.println("Z is greatest number");
        }

        int num = 4;
        if (num % 2 == 0)
            System.out.println(num + " is even");

        System.out.println();

        System.out.println("Ternary Conditional Operator :- condition ? ifTrue : IfFalse; ");

        int n = 12;
        String result = n > 10 ? "greater" : "less";
        System.out.println(result);

        System.out.println();

        System.out.println("Switch statements:- ");

        int s = 1;
        switch (s) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Something went wrong");

        }

        System.out.println();
        System.out.println("While-Loop");

        int i = 1;

        while (i <= 4)
        {
            System.out.println("JI " + i);
            i++;

        }

        System.out.println();
        System.out.println("Do-While-Loop");

        int j = 1;

        do{
            System.out.println("JI " + j);
            j++;
        }while(j >= 4);

        System.out.println();
        System.out.println("For-loop");

        for(int k = 5; k >= 1; k--){
            System.out.println("JI " + k);
        }

    }

}
