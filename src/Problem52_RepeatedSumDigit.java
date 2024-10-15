/* Calculate the sum of all digits of a numbers. If the sum is greater than 9 then again sum the digits. The sum is
continuing until the sum becomes one digit.

Input : 195
Output : 6

Explanation: 1+9+5 =15>9, so 1+5=6 */

import java.util.*;


public class Problem52_RepeatedSumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        // Loop until the sum is a single-digit number
        while (num > 9) {
            num = calculateSum(num);
        }

        System.out.println("The single-digit sum is: " + num);
    }
    public static int calculateSum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num /= 10;
        }
        return sum;
    }
}
