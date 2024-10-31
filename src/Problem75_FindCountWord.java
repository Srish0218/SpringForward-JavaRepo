/* Input : Home, Sweet Home
           Home
 * Output : Number of that word present in the sentence : 2
 *
 * Process
 * ----------
 * The word Home present in the sentence 2 times
 */
import java.util.Scanner;

public class Problem75_FindCountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to count: ");
        String targetWord = sc.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.replaceAll("[^a-zA-Z]", "").equalsIgnoreCase(targetWord)) {
                count++;
            }
        }

        System.out.println("The word \"" + targetWord + "\" is present in the sentence " + count + " times.");

        sc.close();
    }
}
