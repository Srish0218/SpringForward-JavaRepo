import java.util.Scanner;

// Write a Java program that takes an integer input from the user and calculates the sum of its digits.
// The program should then check if the sum is divisible by 3. If the sum is divisible by 3, print TRUE; otherwise, print FALSE.
// Ensure the program handles any non-integer inputs by displaying an error message.
public class Problem3_SumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        try {
            int num = sc.nextInt(); // Read the integer input directly
            int sum = 0;

            // Calculate sum of digits
            while (num > 0) {
                sum += num % 10;  // Add last digit to sum
                num /= 10;        // Remove last digit
            }

            // Check if sum is divisible by 3
            System.out.println(sum % 3 == 0 ? "TRUE" : "FALSE");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer."); // Handle invalid input
        } finally {
            sc.close(); // Close the Scanner
        }
    }
}
