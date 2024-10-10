//In the main method, write code to read a String value using Scanner and print characters at odd position as
//        single String (Not index but position. Refer below example).
//        E.g If the input value is "Matrix". Then we have total 6 characters with 'M'at first position and 'x' at 6th position.
//        Hence the characters at odd position will be 1st, 3rd and 5th character which is "Mti".
//        If the input value has space or any other special character then the same should be conuted as usual.
//        E.g if the input value is "Hi There" then the output will be "H hr"
//        Note that the output is printed in same line with all characters together. ("Mti" and "H hr")
//

import java.util.*;
public class Problem8_CharAtOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String string = sc.nextLine();
        for (int i = 0; i < string.length(); i+=2) {
            System.out.print(string.charAt(i));
        }
    }
}
