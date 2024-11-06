/*
Create a class BankAccount with the following attributes:

accountNumber - int
accountHolderName - String
balance - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - withdraw and deposit in Solution class.

withdraw method:
------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) from which withdrawal
should be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, the method will then check if the balance is sufficient to withdraw the requested amount (double). If yes, it will
deduct the amount from the account balance and return the updated balance.
If the account number is not present or the balance is not sufficient, the method should return -1.

deposit method:
--------------------------------------------
This method will take two input parameters - array of BankAccount objects and the account number (int) in which deposit should
be done.
The method will check if the account number is present in the array of BankAccount objects.
If present, it will add the deposit amount (double) to the account balance and return the updated balance.
If the account number is not present, the method should return -1.

These above mentioned static methods should be called from the main method.

For withdraw method - The main method should print the updated balance if the returned value is greater than or equal to 0, or
it should print "Sorry - Insufficient balance" if the returned value is -1, or it should print "Sorry - Account not found" if
the returned value is -2.

For deposit method - The main method should print the updated balance if the returned value is greater than or equal to 0, or
it should print "Sorry - Account not found" if the returned value is -1.

Before calling these static methods in main, a parameterized constructor in the above mentioned attribute sequence as required.

Input
------------------------
1001
Alice
5000.0
1002
Bob
10000.0
1003
Charlie
15000.0
1002
5000.0
1001
10000.0

Output
---------------------------
5000.0
15000.0
 */

import java.util.*;
class Bank_Account{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank_Account(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
public class Problem114_BankAccount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank_Account[] accounts = new Bank_Account[3];
        for(int i=0; i< accounts.length; i++){
            System.out.print("Enter account number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account holder name: ");
            String accountHolderName = sc.next();
            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            accounts[i] = new Bank_Account(accountNumber, accountHolderName, balance);
        }
        System.out.println("Enter account number from which withdrawal should be done");
        int accountWithdrawal = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter amount to withdraw: ");
        double withdrawalAmount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter account number to which amount has to be deposited: ");
        int accountDeposit = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        sc.nextLine();

        double amountAfterWithdrawal = withdrawalMethod(accounts , accountWithdrawal , withdrawalAmount);
        switch ((int)amountAfterWithdrawal){
            case -1:
                System.out.println("Sorry - Insufficient balance");
                break;
            case -2:
                System.out.println("Sorry - Account not found");
                break;
            default:
                System.out.println(amountAfterWithdrawal);
        }

        double amountAfterDeposit = depositMethod(accounts , accountDeposit , depositAmount);
        System.out.println(amountAfterDeposit != -1 ? amountAfterDeposit : "Sorry - Account not found");





    }
    public static double withdrawalMethod(Bank_Account[] accounts, int accountWithdrawal, double amount){
        for(Bank_Account account : accounts){
            if(account.getAccountNumber() == accountWithdrawal){
                if(account.getBalance() < amount){
                    return -1;
                }else{
                    double newBalance = account.getBalance() - amount;
                    account.setBalance(newBalance);
//                    System.out.println("Account after withdrawal: \n" + account.getAccountNumber() + ": " + account.getAccountHolderName() + ": " + account.getBalance());
                    return newBalance;
                }
            }
        }
        return -2;
    }
    public static double depositMethod(Bank_Account[] accounts, int accountDeposit, double amount){
        for(Bank_Account account : accounts){
            if(account.getAccountNumber() == accountDeposit){
                account.setBalance(account.getBalance() + amount);
//                System.out.println("Account after deposit: \n" + account.getAccountNumber() + ": " + account.getAccountHolderName() + ": " + account.getBalance());
                return account.getBalance();
            }
        }
        return -1;
    }



}
