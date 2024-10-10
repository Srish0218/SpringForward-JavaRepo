//Write main method in Solution class.
//In the main method, write code to read a String value using Scanner and print the smallest vowel. Assume all
//input values are in lower case.
//E.g If the input value is "matrix" then output will be a (since there are two vowels a and i where a is smaller as
//        per ASCII sequence).
//
import java.util.*;

public class Problem7_SmallestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' ){
                result.append(string.charAt(i));
            }
        }
        char[] arr = result.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
