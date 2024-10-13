/* Count number of even digit in a number
 * If the count greater than or equal to 3, then print "True" otherwise "False"
 */
import java.util.*;


public class Problem30_evencheck {
    public static void main(String[] args) {
        int evenCount = 0;
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for(String num1 : num.split("")) {
            if(Integer.parseInt(num1) % 2 == 0) {
                evenCount++;
//                System.out.println(num1);
            }
        }
        System.out.println(evenCount);
        System.out.println(evenCount >= 3 ? "True" : "False");


    }
}
