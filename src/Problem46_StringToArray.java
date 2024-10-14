/*
Write a Java program that takes a user-input string and converts it into a character array.
 The program should read a string from the user, create an array of characters with the same length as the string,
 and populate the array with each character of the string. Finally, the program should output the character array in a readable format.

Example Input/Output:

Input: Hello
Output: [H, e, l, l, o]
 */

import java.util.*;

public class Problem46_StringToArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
