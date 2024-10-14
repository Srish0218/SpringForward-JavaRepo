/*
Write a Java program to calculate the sum of all even digits in a given integer input entered as a string.

For example, for the input `234567`, the output should be `12`, as the even digits are 2, 4, and 6, and their sum is 2 + 4 + 6 = 12.
 */

import java.util.*;

public class Problem44_SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            n /= 10;
//            System.out.println(digit);
            if (digit % 2 == 0){
                sum += digit;
            }
        }
        System.out.println("Sum of all the even digits: " + sum);

    }
}
