/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 *
 * Input : 123
 * Output : 321
 *
 * Input : 234
 * Output : Can not reverse
 */


import java.util.Scanner;

public class Problem85_OddReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(n%2!=0){
            System.out.println("Can reverse!");
            System.out.println("Reverse of odd number: ");
            System.out.println(numReversed(n));
        }
        else {
            System.out.println("Can not reverse");
        }
    }
    public static int numReversed(int n) {
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum = sum*10 + digit;
            n = n/10;
        }
        return sum;
    }
}
