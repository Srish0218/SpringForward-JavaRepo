// Find the first non repeated character substring
//Arijit = Arij


import java.util.*;

public class Problem112_FirstNonRepeatedCharSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = findFirstNonRepeatedSubstring(str);
        System.out.println("First non-repeated character substring: " + result);
    }

    public static String findFirstNonRepeatedSubstring(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        StringBuilder substring = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (uniqueChars.contains(ch)) {
                break;
            }
            uniqueChars.add(ch);
            substring.append(ch);
        }

        return substring.toString();
    }
}
