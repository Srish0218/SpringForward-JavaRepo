/* Remove Vowel From A String

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */

import java.util.Scanner;
public class Problem87_RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        for(Character ch : string.toCharArray()) {
            if(!isVowel(ch)) {
                System.out.print(ch);
            }
        }
    }
    public static boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

}
