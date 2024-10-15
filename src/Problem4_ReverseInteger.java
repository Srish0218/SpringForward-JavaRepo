//In the main method, write code to read a numeric digit(without any alphabets or special characters) using
//        Scanner and print it in the reverse sequence as they appear in the input.
//        Consider below sample input and output:
//        Input:
//        12345
//        Output:
//        Reverse of the number is 54321
//

import java.util.Scanner;

public class Problem4_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result = (result* 10) + digit;
            n /= 10;

        }
        System.out.println(result);
    }
}
