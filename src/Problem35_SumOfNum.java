/* Input : 123Arijit1998Arijit10

 * Process :
 * -----------
 * Array : [123, Arijit, 1998, Arijit, 10]
 * Now you should sum up the position of that array where numbers are stored.
 * 123 + 1998 = 2121
 *
 * Output :
 * --------------
 * 2131
 */

import java.util.*;

public class Problem35_SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String num = "";
        for(String ch : string.split("")) {
            if(Character.isDigit(ch.charAt(0))) {
                System.out.print(ch);
                num += ch;
            }
            else {
                num += ch;
                System.out.print(" ");
            }
        }
        String[] nums = num.split(" ");
        for(String ch : nums) {
            System.out.println(ch);
        }
    }
}
