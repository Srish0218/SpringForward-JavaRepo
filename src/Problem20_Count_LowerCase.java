/* Find number of lower case in a string
 * AriJIt = 3
 */

import java.util.Scanner;

public class Problem20_Count_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        int counter = 0;
        for(Character ch : string.toCharArray()){
//            System.out.print(ch);
            if(Character.isLowerCase(ch)){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
