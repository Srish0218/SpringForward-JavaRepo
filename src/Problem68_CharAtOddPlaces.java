/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
 */

import java.util.Scanner;

public class Problem68_CharAtOddPlaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
//        for(int i = 0 ; i < s.length() ; i++){
//            if(i % 2 != 0){
//                System.out.print(s.charAt(i));
//            }
//        }
        String result = "";
        for(int i = 0; i<s.length(); i++){
            if (i % 2 != 0){
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
