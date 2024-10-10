import java.util.*;

public class Problem19_CountVowelConsonantDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(Character.toLowerCase(c))) {
                if(isVowel(c))
                    vowelCount++;
                else 
                    consonantCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
                
            }
        }
        System.out.println("Vowel count: " + vowelCount + " Consonant Count: " + consonantCount + " Digit count: " + digitCount);
        
    }
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
