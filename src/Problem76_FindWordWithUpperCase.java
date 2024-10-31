/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a
capital letter: "The", "Brown", and "Fox". */

import java.util.Scanner;

public class Problem76_FindWordWithUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = sc.nextLine();
        int counter = 0;

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))){
//                System.out.println(word);
                counter++;
            }
        }
        System.out.println(counter);
    }
}
