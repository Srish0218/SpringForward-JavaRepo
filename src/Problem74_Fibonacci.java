/* Write a Java program that takes a user input integer n and prints the Fibonacci series up to n.

The Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers.
The first two numbers in the series are 0 and 1. For example, the first 10 numbers in the Fibonacci series are:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

The program should use a for loop to generate the series.

Sample Input:
20

Sample Output:
0 1 1 2 3 5 8 13

Explanation:
The Fibonacci series up to 20 is: 0, 1, 1, 2, 3, 5, 8, 13. Therefore, the output is "0 1 1 2 3 5 8 13".
*/
import java.util.Scanner;

public class Problem74_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();

        System.out.println("Fibonacci sequence up to " + limit + ": ");

        int a = 0; // First number
        int b = 1; // Second number

        if (limit >= 0) {
            System.out.print(a + " "); // Print 0
        }
        for (int i = 1; b <= limit; i++) {
            System.out.print(b + " ");
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Move to the next pair
            b = next; // Update b to the next Fibonacci number
        }

        sc.close();
    }
}
