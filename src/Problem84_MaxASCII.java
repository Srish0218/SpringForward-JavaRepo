/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */

import java.util.*;
public class Problem84_MaxASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(ch<s.charAt(i))
            {
                ch = s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}