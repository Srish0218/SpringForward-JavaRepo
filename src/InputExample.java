import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) throws IOException {

        // First Method: Using System.in.read() to read a single byte
        System.out.println("Enter a single-digit number: ");
        int num = System.in.read(); // Reads a single byte and captures the ASCII value
        System.out.println("The number is: " + (num - '0')); // Converts ASCII to integer by subtracting ASCII of '0'

        // Clear the remaining bytes in the input stream
        System.in.skip(System.in.available());

//        // Second Method: Using BufferedReader to read a full line for multi-digit input
//        System.out.println("Enter a number: ");
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//
//        int num2 = Integer.parseInt(br.readLine()); // Reads the line and parses it to an integer
//        System.out.println("The number is: " + num2);
//
//        // Closing resources
//        br.close();
//        isr.close();
//
//        // Flushing the input stream to prevent issues with Scanner
//        System.in.skip(System.in.available());

        // Third Method: Using Scanner to read input directly as an integer
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println("The number is: " + num3);

        // Closing the Scanner resource
        sc.close();
    }
}
