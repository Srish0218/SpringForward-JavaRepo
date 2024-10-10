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
