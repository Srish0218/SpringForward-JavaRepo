/* Check a string is palindrome or not
 * Input: pop
 * Output: Palindrome
 *
 * Input: Papa
 * Output: Not Palindrome
 */

import java.util.*;

public class Problem94_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();

        System.out.println(isPalindrome(string) ? "Palindrome" : "Not Palindrome");
    }
    public static boolean isPalindrome(String word) {
        if (word.length() > 1) {
            int w = 0;
            while(w < (word.length()/2)){
                if(word.charAt(w) == word.charAt(word.length() - (w+1))){
                    return true;
                }
                w++;
            }
        }
        return word.length() == 1;

    }
}
