/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998  10 = 2131
 *
 * Output :
 * --------------
 * 2131
 */

import java.util.*;

public class Problem35_SumOfNum {
    public static void main(String[] args)
    {
        int sum=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert character to digit and build the number
                num = num * 10 + (ch - '0');
            } else {
                // If not a digit, add the accumulated number to sum and reset
                sum += num;
                num = 0;
            }
        }

        // Add the last accumulated number to sum (if any)
        sum += num;

        System.out.println(sum);

    }
}
