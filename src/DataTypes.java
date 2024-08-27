class Main {
    public static void main(String a[] ) {
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
}
