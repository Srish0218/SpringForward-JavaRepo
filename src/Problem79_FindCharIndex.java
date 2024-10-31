/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 * Output:
 ---------------
   1
 * Input2:
 ----------------
   Carrot
   z
 * Output:
  --------------
   NA
 */

import java.util.Scanner;

public class Problem79_FindCharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = sc.nextLine();

        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NA");
        }

        sc.close();
    }
}
