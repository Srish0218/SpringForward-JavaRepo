/* Remove duplicate characters in a string
 *
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */


import java.util.*;

public class Problem88_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));
        }
        System.out.println(characters);
        for(Character ch : characters) {
            System.out.print(ch);
        }
    }
}
