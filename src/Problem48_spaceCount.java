/* Count number of spaces and characters in a string
 * Input
 * ---------
 * Arijit is bad boy
 *
 * Output
 * ------------------
 * Number of space : 3
   Number of character : 14
*/

import java.util.*;

public class Problem48_spaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = sc.nextLine();
        int spaceCount = 0;
        int charCount = 0;
        for(Character ch : string.toCharArray()) {
            if (ch == ' ')
                spaceCount++;
            else
                charCount++;

        }
        System.out.println("Space Count: " + spaceCount);
        System.out.println("Char Count: " + charCount);
    }
}
