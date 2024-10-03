public class string {
    public static void main(String[] args) {
        // String created using string literal - stored in the string pool
        String name = "Srishti";
        System.out.println("Initial value of name: " + name);

        // String created using 'new' keyword - stored in the heap, outside the string pool
        String name1 = new String("Kuki");
        System.out.println("Value of name1 (created using new keyword): " + name1);

        // Concatenating a string creates a new string object (since strings are immutable)
        name = name + " Jaitly";
        System.out.println("After concatenation, new value of name: " + name);

        // Accessing character at a specific index using charAt()
        System.out.println("Character at index 5 of name: " + name.charAt(5));

        // Concatenating name and name1 using the concat() method
        System.out.println("Concatenation of name and name1: " + name.concat(" " + name1));

        // Two string literals with the same value - 's1' and 's2' point to the same string object in the string pool
        String s1 = "love";
        String s2 = "love";

        // Checking if s1 and s2 point to the same reference (they do, because they are string literals in the pool)
        System.out.println("Are s1 and s2 pointing to the same object in the string pool? " + (s1 == s2)); // true

        // Creating a string using 'new' keyword, so it is stored in heap memory outside the pool
        String s3 = new String("love");

        // s1 (in the string pool) and s3 (in heap memory) are different objects
        System.out.println("Are s1 and s3 pointing to the same object before intern()? " + (s1 == s3));  // false

        // Interning s3 - this moves s3 to the string pool, so now it references the same object as s1
        s3 = s3.intern();

        // After interning, s1 and s3 point to the same object in the string pool
        System.out.println("Are s1 and s3 pointing to the same object after intern()? " + (s1 == s3));  // true

        System.out.println("\n--- StringBuffer Operations ---");

        // StringBuffer example (mutable, unlike String)
        StringBuffer sb = new StringBuffer("Satyam");
        System.out.println("Initial capacity of StringBuffer: " + sb.capacity());  // Default capacity is 16 + string length
        System.out.println("Initial length of StringBuffer: " + sb.length());  // Length is the actual number of characters in the buffer

        // Appending a string to the buffer
        sb.append(" Pratap");
        System.out.println("After appending: " + sb);

        // Inserting a string at a specific index
        sb.insert(0, "Srishti ");
        System.out.println("After inserting at index 0: " + sb);

        // Deleting a character at a specific index
        sb.deleteCharAt(2);
        System.out.println("After deleting char at index 2: " + sb);

        // Setting a new length (increases buffer size if necessary)
        sb.setLength(30);
        System.out.println("After setting new length to 30: " + sb);  // Will pad with null characters ('\0')

        // Ensuring the buffer has a minimum capacity (no immediate effect on output)
        sb.ensureCapacity(200);
        System.out.println("Ensured capacity of at least 200.");

    }
}
