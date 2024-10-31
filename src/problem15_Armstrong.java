/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;



public class problem15_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int len = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum = sum + power(digit , len );
            num = num / 10;

        }
        System.out.println(sum == originalNum ? "YES, is armstrong" : "NO, its not armstrong");

    }

    public static int power(int num , int power){
        int i = 0;
        int poweredNum = 1;

        while (i < power){
            poweredNum *= num;
            i++;

        }
        return poweredNum;
    }
}
