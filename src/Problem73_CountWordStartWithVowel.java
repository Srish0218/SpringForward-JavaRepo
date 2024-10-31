/* Count the words in a sentence which are start with vowel.
 *
 * Input: Arijit is student of MCA
 * Output: 3
 *
 * Input: Sara plays tennis
 * Output: No such words
 */

import java.util.Scanner;

public class Problem73_CountWordStartWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence = sc.nextLine();
        String[] words = sentence.toLowerCase().split(" ");
        int count = 0;
        for (String word : words) {
//            System.out.println(word.charAt(0));
            if(isVowel(word.charAt(0))){
                count++;
            }
        }
        System.out.println(count > 0 ? count : "No such words");
    }
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o');
    }
}
