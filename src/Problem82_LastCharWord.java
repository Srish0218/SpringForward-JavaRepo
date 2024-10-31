/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */


import java.util.Scanner;

public class Problem82_LastCharWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(word.length()-1));
        }
    }
}
