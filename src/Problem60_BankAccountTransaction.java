

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}

class Transaction{
    private String transactionCode;
    private double amount;
    private String timestamp;
    public Transaction(String transactionCode, double amount, String timestamp){
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}

class BankUtils{
    BankAccount from;
    BankAccount to;
    double amount;
    String timestamp;

    public BankUtils(BankAccount from, BankAccount to, double amount , String transactionCode){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.timestamp = transactionCode;
    }
//    public static void transferFunds(BankAccount from, BankAccount to, double amount , String transactionCode){
//
//    }

}


public class Problem60_BankAccountTransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[2];
        System.out.println("Bank Details: ");
        for(int i = 0; i< accounts.length; i++){
            System.out.println("Account " + (i+1) + ": ");
            System.out.println();
            System.out.println("Account Number: ");
            String accountNumber = input.nextLine();
            System.out.println("Account Holder Name: ");
            String accountHolderName = input.nextLine();
            System.out.println("Account Balance: ");
            double balance = input.nextDouble();
            input.nextLine();
            accounts[i] = new BankAccount(accountNumber, accountHolderName, balance);
        }

        System.out.println("Transfer details: ");
        System.out.println("Amount to Transfer: ");
        double amountToTransfer = input.nextDouble();
        input.nextLine();
        System.out.println("Transaction Code: ");
        String transactionCode = input.nextLine();

        BankUtils bankUtils = new BankUtils(accounts[0] , accounts[1] , amountToTransfer , transactionCode);


    }
}
