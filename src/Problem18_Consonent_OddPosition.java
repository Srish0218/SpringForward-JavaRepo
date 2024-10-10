/* Find the characters in odd position of a string which are consonent
 *
 * Input: Arijit Ghosh
 * Output: hs
 */

import java.util.Scanner;

public class Problem18_Consonent_OddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ; i += 2){
            if (isConsonant(s.charAt(i))){
                System.out.print(s.charAt(i));

            }
        }
    }
    public static boolean isConsonant(char ch){
        return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == ' ');
    }
}
