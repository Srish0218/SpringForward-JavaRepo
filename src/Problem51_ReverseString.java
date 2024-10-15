/* Reverse of a string
 * Arijit = tijirA
 */
import java.util.*;

public class Problem51_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        String reversed = "";
        for(String str : string.split("")) {
            reversed = str + reversed;
        }
        System.out.println(reversed);
    }
}
