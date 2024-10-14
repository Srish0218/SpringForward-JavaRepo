/* Write a Java program to find the sum of all even numbers in an array of integers.

Here's an example of the expected input and output:

Input array: {10, 5, 20, 8, 13}
Output:
Sum of even numbers: 38

*/
import java.util.*;

public class Problem45_SumEvenDigitInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Create an integer array to store the elements

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0; // Variable to store the sum of even numbers
        for (int num : arr) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add it to the sum if it is even
            }
        }

        System.out.println("Sum of even numbers: " + sum); // Output the result
    }
}