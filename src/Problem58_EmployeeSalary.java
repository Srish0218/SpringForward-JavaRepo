/*
Create a class Employee with the below attributes:
EmpId - int
EmpName - String
Dept - String
Rating - int
Salary - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findDept and findSecondHighestSalary in Solution class.

findDept method:
-----------------------------------.
This method will take two input parameters - array of Employee objects and int parameter. The method
will return the dept array attribute from employee objects whose salary is matched with int parameter and rating greater than
equal to 3. If no data found of beach objects, then the method should return null.

findSecondHighestSalary method:
-----------------------------------
This method will take two input parameters - array of Employee objects and string parameter. The method
will return the second highest salary from employee objects whose dept is matched with string parameter.
If no data found of beach objects, then the method should return 0.

Note: No two employees have same rating. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findDept method - The main method should print the dept from the Employee array. If return null, then you should print
"No Department found".
For findSecondHighestSalary method - The main method should print the 2nd highest salary from the Employee array with
the following condition. If return 0, then you should print "No data found".


Input ->
101
Arijit
Computer
4
35000
102
Rakesh
Electronics
2
18000
103
Mahima
Mechanical
3
35000
104
Saniya
Mechanical
5
68000
105
Rajesh
Computer
1
30000
35000
Mechanical

Output ->
Computer, Mechanical
35000
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeSalary {
    private int EmpId;
    private String EmpName;
    private String Dept;
    private int Rating;
    private int Salary;

    public EmployeeSalary(int EmpId, String EmpName, String Dept, int Rating, int Salary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Dept = Dept;
        this.Rating = Rating;
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public int getRating() {
        return Rating;
    }

    public String getDept() {
        return Dept;
    }
}

public class Problem58_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeSalary[] employees = new EmployeeSalary[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter employee ID: ");
            int EmpId = sc.nextInt();
            sc.nextLine();  // consume newline

            System.out.print("Enter employee name: ");
            String EmpName = sc.nextLine();

            System.out.print("Enter employee department: ");
            String Dept = sc.nextLine();

            System.out.print("Enter employee rating: ");
            int Rating = sc.nextInt();
            sc.nextLine();  // consume newline

            System.out.print("Enter employee salary: ");
            int Salary = sc.nextInt();
            sc.nextLine();  // consume newline

            employees[i] = new EmployeeSalary(EmpId, EmpName, Dept, Rating, Salary);
        }

        System.out.print("Enter employee salary parameter: ");
        int salaryParameter = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter employee department parameter: ");
        String DeptParameter = sc.nextLine();

        // Find departments with salary match and rating >= 3
        String[] departmentBySalary = findDept(employees, salaryParameter);
        if (departmentBySalary != null) {
            for (String department : departmentBySalary) {
                System.out.println(department);
            }
        } else {
            System.out.println("No departments found");
        }

        // Find the second highest salary in the specified department
        int secondHighestSalary = findSecondHighestSalary(employees, DeptParameter);
        if (secondHighestSalary > 0) {
            System.out.println("Second Highest salary is " + secondHighestSalary);
        } else {
            System.out.println("No data found");
        }
    }

    public static String[] findDept(EmployeeSalary[] employees, int salaryParameter) {
        List<String> departments = new ArrayList<>();
        for (EmployeeSalary employee : employees) {
            if (employee.getSalary() == salaryParameter && employee.getRating() >= 3) {
                departments.add(employee.getDept());
            }
        }
        return departments.isEmpty() ? null : departments.toArray(new String[0]);
    }

    public static int findSecondHighestSalary(EmployeeSalary[] employees, String DeptParameter) {
        List<Integer> empSalaryByDepartment = new ArrayList<>();
        for (EmployeeSalary employee : employees) {
            if (employee.getDept().equalsIgnoreCase(DeptParameter)) {
                empSalaryByDepartment.add(employee.getSalary());
            }
        }
        return empSalaryByDepartment.isEmpty() ? 0 : secondHighestSalary(empSalaryByDepartment);
    }

    public static int secondHighestSalary(List<Integer> empSalaryByDepartment) {
        int highestSalary = Integer.MIN_VALUE;
        int secondHighestSalary = Integer.MIN_VALUE;

        for (Integer empSalary : empSalaryByDepartment) {
            if (empSalary > highestSalary) {
                secondHighestSalary = highestSalary;
                highestSalary = empSalary;
            } else if (empSalary > secondHighestSalary && empSalary != highestSalary) {
                secondHighestSalary = empSalary;
            }
        }
        return secondHighestSalary;
    }
}
