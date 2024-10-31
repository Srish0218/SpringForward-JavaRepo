/* Find number of upper case in a string
 * AriJIt = 3
 */

import java.util.Scanner;

public class Problem71_CountUpperCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        int count = 0;
        for(Character ch : string.toCharArray()){
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.println(count);
    }

}
