/*
Create a Java program that decodes a specific pattern of encoded strings. The input string alternates between letters and digits,
where each letter is immediately followed by a digit representing the number of times the letter should be repeated.
The program should decode this pattern and output the expanded string with repeated characters based on the digits.

Example Input/Output:

Input: a2b3c1
Output: aabbbc
 */

import java.util.Scanner;

public class Problem53_repeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        String repeatedString = "";

        for (int i = 0; i < string.length(); i++) {
            // Check if the current character is a letter
            if (Character.isAlphabetic(string.charAt(i))) {
                // Get the letter
                char letter = string.charAt(i);
                // The next character should be a digit
                if (i + 1 < string.length() && Character.isDigit(string.charAt(i + 1))) {
                    // Parse the digit
                    int count = Character.getNumericValue(string.charAt(i + 1));
                    // Repeat the letter 'count' times
                    for (int j = 0; j < count; j++) {
                        repeatedString += letter;
                    }
                }
            }
        }

        System.out.println("Decoded string: " + repeatedString);
    }
}