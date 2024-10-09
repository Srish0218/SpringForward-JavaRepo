//Write main method in Solution class.
//In the main method, read a String and print all consonants characters (in lower case) in the sequence as they
//appear in the input value. Please note: The consonants are characters that are not vowels.
//Sample input:
//DATABase
//Output:
//dtbs

import java.util.*;

public class Problem6_printOnlyConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        for(int i = 0; i<word.length() ; i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
            }else {
                System.out.print(word.charAt(i));
            }


        }
    }
}
