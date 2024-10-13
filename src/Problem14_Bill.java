
/*
Create a class Bill with below attributes:

billNo- int
name - String
typeOfConnection - String
billAmount - double
status – boolean

where billNo is the bill number, name is the name of the customer, typeOfConnection is the type of the connection
(prepaid, postpaid), billAmount is the bill amount and status is whether the bill is paid or not (if paid then value is TRUE
else value is FALSE).

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - findBillWithMaxBillAmountBasedOnStatus and getCountWithTypeOfConnection in Solution class.

findBillWithMaxBillAmountBasedOnStatus method:
-----------------------------------------------------
This method will take an array of Bill objects and a boolean parameter as parameters.
The method will return bill object array in ascending order of their bill number from the array of Bill objects whose bill
amount is maximum in the array with the status attribute that matches with the input parameter.

If no Bill with the given status is present in the array of Bill objects, then the method should return null.

getCountWithTypeOfConnection method:
-----------------------------------------------------
This method will take two input parameters - array of Bill objects and string parameter ( for type of connection).
The method will return the count of bills from array of bill objects for the given type of connection.
If no bill with the given type of connection is present in the array of bill objects, then the method should return 0.


Note :

Two bill object can have the same bill amount.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findBillWithMaxBillAmountBasedOnStatus method - The main method should print the billNo followed by # and name from the
returned Bill object array if the returned value is not null.

If the returned value is null then it should print "There are no bill with the given status".

For getCountWithTypeOfConnection method - The main method should print the count of bills as it is, if the returned value is
greater than 0,  otherwise it should print "There are no bills with given type of connection".

Before calling these static methods in main, use Scanner to read the number of object and objects to read the values of Bill
objects referring attributes in the above mentioned attribute sequence.

Next, read the value for status and typeOfConnection.


Consider below sample input and output:
Input:

4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid

Output:

222#Rekha Kumar
3
*************************************************************************************
*/
import java.util.*;

class Bill{
    private int billNo;
    private String name;
    private String typeOfConnection;
    private double billAmount;
    private boolean status;

    public Bill(int billNo, String name, String typeOfConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeOfConnection = typeOfConnection;
        this.billAmount = billAmount;
        this.status = status;

    }
    public Boolean getStatus(){
        return this.status;
    }
    public int getBillNo(){
        return this.billNo;
    }

    public double getBillAmount() {
        return this.billAmount;
    }

    public String getTypeOfConnection() {
        return this.typeOfConnection;
    }

    public String getName() {
        return this.name;
    }
}

public class Problem14_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bills: ");
        int n = sc.nextInt();
        sc.nextLine();
        Bill[] bills = new Bill[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter bill no: ");
            int billNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter type of connection: ");
            String typeOfConnection = sc.nextLine();
            System.out.println("Enter bill amount: ");
            double billAmount = sc.nextDouble();
            System.out.println("Enter status (true for paid, false for unpaid): ");
            boolean status = sc.nextBoolean();
            sc.nextLine();

            bills[i] = new Bill(billNo, name, typeOfConnection, billAmount, status);
        }

        System.out.println("Enter status to search (true for paid, false for unpaid): ");
        boolean statusRequired = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Enter type of connection to count: ");
        String typeOfConnectionRequired = sc.nextLine();

        Bill maxBill = findBillWithMaxBillAmountBasedOnStatus(bills, statusRequired);
        if (maxBill != null) {
            System.out.println(maxBill.getBillNo() + "#" + maxBill.getName());
        } else {
            System.out.println("There are no bill with the given status");
        }

        int count = getCountWithTypeOfConnection(bills, typeOfConnectionRequired);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("There are no bills with given type of connection");
        }
    }

    public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] bills, boolean statusRequired) {
        Bill maxBill = null;
        for (Bill bill : bills) {
            if (bill.getStatus() == statusRequired) {
                if (maxBill == null || bill.getBillAmount() > maxBill.getBillAmount()) {
                    maxBill = bill;
                } else if (bill.getBillAmount() == maxBill.getBillAmount() && bill.getBillNo() < maxBill.getBillNo()) {
                    maxBill = bill;
                }
            }
        }
        return maxBill;
    }

    public static int getCountWithTypeOfConnection(Bill[] bills, String typeOfConnection) {
        int count = 0;
        for (Bill bill : bills) {
            if (bill.getTypeOfConnection().equalsIgnoreCase(typeOfConnection)) {
                count++;
            }
        }
        return count;
    }
}
