/*Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation: There are two words in the sentence that start and end with the same letter - "Anna" and "Ginseng". */

import java.util.*;

public class Problem50_Same1st2ndLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = sc.nextLine();
        String[] words = string.split(" ");
        int counter = 0;
        for(String word : words){
            word = word.toLowerCase();
//            System.out.println(word);
            if (word.length() > 1 && word.charAt(0) == word.charAt(word.length() - 1)) {
                counter++;
                System.out.println(word);
            }
        }
        System.out.println("Number of words with the same first and last letter (case-insensitive): " + counter);
    }
}
