/* Find the occurance of each character in a string
 * Input: Hello world
 * Output:
 *  H: 1
    e: 1
    l: 3
    o: 2
    w: 1
    r: 1
    d: 1
*/

import java.util.*;

public class Problem95_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        LinkedHashMap<Character, Integer> occurrences = new LinkedHashMap<>();
        for(Character ch : sentence.toCharArray()) {
            if(Character.isLetter(ch)) {
                if(occurrences.containsKey(ch)) {
                    occurrences.put(ch, occurrences.get(ch) + 1);
                }else{
                    occurrences.put(ch, 1);
                }
            }
        }
        for(Character ch : occurrences.keySet()) {
            System.out.println(  ch + " : " + occurrences.get(ch));
        }
    }
}
