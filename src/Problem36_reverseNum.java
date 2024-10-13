import java.util.Scanner;

public class Problem36_reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        int result = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            sum += rem;
            result = result * 10 + rem;

        }
        System.out.println("The reversed number is: " + result);
        System.out.println("The sum is: " + sum);
        System.out.println(sum % 3 == 0 ? "TRUE" : "FALSE");
    }
}
