/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.*;
public class Problem17_Consecutive2vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {

//            String[] ch = word.split("");
            if (word.length() >=2) {
//                System.out.println(word);
                for (int i = 0; i < word.length() - 1; i++) {
                    if (isVowel(word.charAt(i))  && isVowel(word.charAt(i + 1))) {
                        count += 1;

                    }
                }
            }


        }
        System.out.println(count);

    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
