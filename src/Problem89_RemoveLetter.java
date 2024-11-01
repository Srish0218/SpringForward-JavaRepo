/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class Problem89_RemoveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("Enter char to remove: ");
        char ch = sc.next().charAt(0);

//        METHOD 1:
//        for (int i = 0; i < string.length(); i++) {
//            if (!(string.charAt(i) == ch)) {
//                System.out.print(string.charAt(i));
//
//            }
//        }

//        METHOD 2:
        // Convert string to ArrayList<Character>
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : string.toCharArray()) {
            characters.add(c);
        }

        // Use an iterator to safely remove matching characters
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == ch) {
                iterator.remove();
            }
        }

        // Print the modified list of characters
        for (Character character : characters) {
            System.out.print(character);
        }
    }
}
