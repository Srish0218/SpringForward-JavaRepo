/*
Create a class Employee with the following attributes:

name (string)
age (int)
salary (double)
Write getters, setters, and a parameterized constructor in the above-mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateYearlySalary and calculateTax in the Solution class.

calculateYearlySalary method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the yearly salary of the employee (assuming that the employee works for 12 months in a year) and
return it as a double.

calculateTax method:
-----------------------------------------
This method will take an Employee object as input.
The method will calculate the tax to be paid by the employee based on the following rules:

If the yearly salary is less than or equal to 50000, the tax is 10% of the yearly salary.
If the yearly salary is greater than 50000 but less than or equal to 100000, the tax is 20% of the amount over 50000 plus 10%
of the first 50000.
If the yearly salary is greater than 100000, the tax is 30% of the amount over 100000 plus 20% of the amount between 50000 and
100000 plus 10% of the first 50000.
The method will return the tax amount as a double.
These above-mentioned static methods should be called from the main method.

For calculateYearlySalary method - The main method should print the yearly salary returned by the method.

For calculateTax method - The main method should print the tax amount returned by the method.

Before calling these static methods in main, use a Scanner object to read the values of an Employee object's attributes.

Example Input:
----------------
John
30
55000.0

Example Output:
----------------
Yearly salary of John: 660000.0
Tax to be paid by John: 183000.0
 */

import java.util.Scanner;

class EmployeeSalaryTax {
    private String name;
    private int age;
    private double salary;

    public EmployeeSalaryTax(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getYealySalary() {
        return 12 * salary;
    }
}

public class Problem62_EmployeeSalaryTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee details: ");
        System.out.println("Employee name: ");
        String name = sc.nextLine();

        System.out.print("Employee age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        EmployeeSalaryTax employee = new EmployeeSalaryTax(name, age, salary);

        double employeeYearlySalary = calculateYearlySalary(employee);
        System.out.println("Yearly Salary of " + name + " : " +employeeYearlySalary);

        double taxToBePaid = calculateTax(employeeYearlySalary);
        System.out.println("Tax to paid : " + taxToBePaid);

    }
    public static double calculateYearlySalary(EmployeeSalaryTax employee) {
        return employee.getYealySalary();
    }
    public static double calculateTax(double yearlySalary) {
        if (yearlySalary <= 50000) {
            return yearlySalary * 0.10;
        }
        else if (yearlySalary <= 100000 && yearlySalary > 50000) {
            return (0.20 * (yearlySalary - 50000)) + (50000 * 0.10);
        }
        else{
            return (0.30 * (yearlySalary - 100000)) + (50000 * 0.10) + (50000 * 0.20);
        }


    }
}
