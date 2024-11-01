/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 *
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 *
 * Input : 8
 * Output : Not Perfect Number
 *
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */

import java.util.*;

public class Problem92_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(n == sum) {
            System.out.println("Perfect Number");

        }else {
            System.out.println("Not Perfect Number. Sum of factors of" + n + " is " + sum );
        }
    }
}
