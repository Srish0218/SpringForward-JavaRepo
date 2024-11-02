/*
Find total interest of an amount.

Create a class Account with following attributes :
id - int
balance - double
interestRate - double

Take another integer as number of year.
After that calculate total interest using formula:


Total Interest = Total Interest = Balance×Interest Rate×Years
 */
import java.util.*;

class CalculateInterest {
    private int id;
    private double balance;
    private double interestRate;

    public CalculateInterest(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
}

public class Problem101_Calculate_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        CalculateInterest account = new CalculateInterest(id, balance, rate);

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double interest = calculateInterest(account, years);
        System.out.print("Total Interest: ");
        System.out.format("%.3f", interest);
    }

    public static double calculateInterest(CalculateInterest account, int years) {
        return account.getBalance() * (account.getInterestRate() / 100) * years;
    }
}
