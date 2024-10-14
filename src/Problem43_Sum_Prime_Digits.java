/* Count the sum of prime digits in a given number
 *
 * Input: 2345678910
 * Output: 17
 *
 * Explaination: 2+3+5+7 = 17
 */

import java.util.*;

public class Problem43_Sum_Prime_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(isPrime(digit)) {
                sum += digit;
            }
        }
        System.out.println(sum);


    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
