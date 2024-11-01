/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 *
 * Input: abbcddeff
 * Output: abcdef
 */

import java.util.*;


public class Problem90_Remove2ConsecutiveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            if(stack.isEmpty() || stack.peek() != string.charAt(i)){
                stack.push(string.charAt(i));
            }
        }
//        System.out.println(stack);
        for(char c : stack){
            System.out.print(c);
        }
    }
}
