/* Find the palindrome words from the sentence and print them and also count
 *
 * Input:
 * ----------------
 * My name is nitin and I can speak malayalam
 *
 * Output:
 * ----------------
 * nitin
 * I
 * malayalam
 * 3
 */

import java.util.*;

public class Problem93_Palindrome_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int counter = 0;
        for (String word : words) {
            if(isPalindrome(word.toLowerCase())){
                System.out.println(word);
                counter++;
            }
        }
        System.out.println(counter);

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
