/* Find first letter of each word in a string
    Input : Kalyani Govt. Eng. College
    Output : KGEC
*/

import java.util.*;

public class Problem77_FirstLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0));
        }

    }
}
