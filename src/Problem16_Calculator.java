import java.util.Scanner;

public class Problem16_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operator ( + , - , * , /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");


        }
    }
}
