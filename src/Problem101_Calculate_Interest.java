/*
Find total interest of an amount.

Create a class Account with following attributes :
id - int
balance - double
interestRate - double

Take another integer as number of year.
After that calculate total interest using formula:

Percentage = interestRate * 100 / time
Total Interest = Percentage + interestRate
 */

import java.util.*;

class CalculateInterest{
    private int id;
    private double balance;
    private double interestRate;
    public CalculateInterest(int id, double balance, double interestRate){
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }

}

public class Problem101_Calculate_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();
        CalculateInterest account = new CalculateInterest(id, balance, rate);

        System.out.println("Enter number of years: ");
        int years = sc.nextInt();
        sc.nextLine();

        double interest = calculateInterest(account , years);
        System.out.println("Interest: ");
        System.out.format("%.3f",interest);
    }
    public static double calculateInterest(CalculateInterest account , int years){
        return ((account.getInterestRate() / 100) * years)  + account.getInterestRate();
    }
}
