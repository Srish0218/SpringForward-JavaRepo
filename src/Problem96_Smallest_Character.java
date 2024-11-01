/* Minimum Ascii valued character in a String
* srishti -> h
*  */

import java.util.*;

public class Problem96_Smallest_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = sc.nextLine();
        char smallestchar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if(string.charAt(i) < smallestchar){
                smallestchar = string.charAt(i);
            }
        }
        System.out.println("Minimum Ascii valued character in a String is: " + smallestchar);
    }
}
