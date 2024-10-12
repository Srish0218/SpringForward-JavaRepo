/*
Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details
(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
--------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
 */

import java.util.*;
class Employee{
    private int emp_id;
    private String emp_name;
    private String emp_designation;
    private double emp_salary;

    public Employee(int emp_id, String emp_name, String emp_designation, double emp_salary){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_designation = emp_designation;
        this.emp_salary = emp_salary;
    }
    public double getEmp_salary() {
        return this.emp_salary;
    }
    public String getEmp_designation() {
        return this.emp_designation;
    }
    public String toString(){

        return "ID: " + emp_id + ", Name: " + emp_name + ", Designation: " + emp_designation;
    }
}

class Company{
    private String companyName;
    private Employee[] employees;
    private int numOfEmployees;

    public Company(String companyName, Employee[] employees, int numOfEmployees){
        this.numOfEmployees = numOfEmployees;
        this.employees = employees;
        this.companyName = companyName;
    }
    public double averageSalary(Employee[] employees) {
        double sum = 0;
        for(Employee e: employees)
            sum += e.getEmp_salary();
        if (sum > 0)
            return sum / employees.length;
        else return 0;
    }
    public double getMaxSalary(Employee[] employees) {
        double max = employees[0].getEmp_salary();
        for (Employee e: employees){
            if(e.getEmp_salary() > max)
                max = e.getEmp_salary();
        }
        return max;
    }
    public List<Employee> getEmployeesByDesignation(Employee[] employees , String designationRequired) {
        List<Employee> employeesByDesignation = new ArrayList<>();
        for(Employee e: employees){
            if(e.getEmp_designation().equalsIgnoreCase(designationRequired))
                employeesByDesignation.add(e);
        }
        return employeesByDesignation;
    }

}

public class Problem21_Company_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name: ");
        String companyName = sc.nextLine();
        System.out.println("Enter number of employees: ");
        int numOfEmployees = sc.nextInt();
        System.out.println("Enter employee details: ");
        Employee[] employees = new Employee[numOfEmployees];
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Employee: " + (i + 1));
            System.out.println("Enter employee id: ");
            int emp_id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name: ");
            String emp_name = sc.nextLine();
            System.out.println("Enter employee designation: ");
            String emp_designation = sc.nextLine();
            System.out.println("Enter employee salary: ");
            double emp_salary = sc.nextDouble();
            sc.nextLine();
            employees[i] = new Employee(emp_id , emp_name , emp_designation , emp_salary);
        }
        System.out.println("Designation to search: ");
        String designationSearch = sc.nextLine();
        Company company = new Company(companyName, employees, numOfEmployees);
        System.out.println("Average salary of employees: ");
        System.out.println(company.averageSalary(employees));
        System.out.println("Max salary of employees: ");
        System.out.println(company.getMaxSalary(employees));
        System.out.println("Employee details with designation as " + designationSearch);
        List<Employee> employeesByDesignation = company.getEmployeesByDesignation(employees, designationSearch);
        for(Employee e: employeesByDesignation)
            System.out.println(e);
    }
}
