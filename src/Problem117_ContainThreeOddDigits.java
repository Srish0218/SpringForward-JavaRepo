/*
Write the main method in the Solution class.

In the main method, read an integer value and print "TRUE" If It contains at least 3 odd digits. Else It should print "FALSE".
For example, if the value is 123456 and it contains 3 odd digits such as 1,3,5. So it should print "TRUE", The output should be in the format of sample output.

Sample input1: 123456
Output: TRUE

Sample input2: 123
Output: FALSE
 */

import java.util.*;
public class Problem117_ContainThreeOddDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isOddDigit(digit)){
                count++;
            }
            num /= 10;
        }
        System.out.println(count >= 3 ? "TRUE" : "FALSE");

    }
    public static boolean isOddDigit(int num){
        return num % 2 != 0;
    }
}
