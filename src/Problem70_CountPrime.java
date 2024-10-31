/* Count number of prime digit in a Number
 * Input : 254786135
 * Output : 5
 */

import java.util.Scanner;
public class Problem70_CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while(num != 0){
            int n = num % 10;
            if(isPrime(n)){
                count++;
            }
            num /= 10;


        }
        System.out.println(count);


    }
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
