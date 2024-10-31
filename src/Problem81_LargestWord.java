/* Find largest word from a given sentence
 *
 Input: He is so funny boy
 Output: funny
 */
import java.util.Scanner;

public class Problem81_LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}
