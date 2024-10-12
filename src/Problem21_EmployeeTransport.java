//Create a class called Employee with the below attributes:
//
//employeeld - int
//name - String
//branch - String
//rating - double
//company Transport - boolean
//The above attributes should be private. write getters, setters and parameterized constructor as required.
//
//        Create class MyClass with main method.
//Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
//in MyClass class.
//
//findCountOfEmployeesUsingCompTransport method:
//        ----------------------------------------------
//This method will take an array of Employee object and a String parameter as input parameters.
//This method will calculate and return the count of Employees who are all using company transport
//in the given branch (String parameter passed).
//If no Employee in the given branch using company transport in the array of Employee objects, then
//the method should return 0.
//
//findEmployeeWithSecondHighestRating method:
//        --------------------------------------------
//This method will take an array of Employee objects as an input parameter. This method will return
//the object of the second highest rating employee from the array of Employee objects who are not using
//company transport.
//If all Employees using company transport in the array of Employee objects, then the method should return null.
//
//Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee
//is unique.
//For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it
//is if the returned value is greater than 0, else it should print "No such Employees".
//Ex: 2 , where 2 is the count
//For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from
//the returned object if the returned value is not null. If the returned value is null, then it should
//print "All Employees using company transport".
//Ex: 1003
//Uma
//where 1003 is the employeeld and Uma is the name.
//Before calling these static methods in main, use Scanner object to read the values of four Employee
//objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
//parameter for capturing branch.
//
//Input :
//
//        1001
//Ashwa
//        IT
//5
//        true
//        1002
//Preeti
//        IT
//4
//        true
//        1003
//Uma
//        Admin
//3
//        false
//        1004
//Akash
//        Hardware
//4.5
//        false
//IT
//
//
//
//Output :
//
//        2
//        1003
//Uma

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EmployeeTransport{
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    public EmployeeTransport(int employeeld, String name, String branch, double rating, boolean companyTransport){

        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;

    }
    public String getBranch(){
        return this.branch;
    }
    public boolean getCompanyTransport(){
        return this.companyTransport;
    }

    public double getRating(){
        return this.rating;
    }
    public int getEmployeeld(){
        return this.employeeld;
    }
    public String getName(){
        return this.name;
    }


}


public class Problem21_EmployeeTransport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        EmployeeTransport[] employees = new EmployeeTransport[4];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter employee Id: " + (i + 1));
            int employeeId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee Name: " + (i + 1));
            String employeeName = sc.next();

            System.out.println("Enter employee Branch: " + (i + 1));
            String employeeBranch = sc.next();

            System.out.println("Enter employee Rating: " + (i + 1));
            double employeeRating = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter employee Company Transport: " + (i + 1));
            boolean companyTransport = sc.nextBoolean();
            sc.nextLine();
            employees[i] =  new EmployeeTransport(employeeId, employeeName, employeeBranch, employeeRating, companyTransport);
        }

        System.out.println("Enter branch to get details for: ");
        String branchSearch = sc.nextLine();

        System.out.println("Output: ");
        System.out.println("Number of employees using transport from branch " + branchSearch);
        int result1 = findCountOfEmployeesUsingCompTransport(employees , branchSearch);
        System.out.println(result1 > 0? result1: "No such Employees");

        EmployeeTransport secondHighestRatingEmployee = findEmployeeWithSecondHighestRating(employees);
        if (secondHighestRatingEmployee != null) {
            System.out.println(secondHighestRatingEmployee.getEmployeeld());
            System.out.println(secondHighestRatingEmployee.getName());
        } else {
            System.out.println("All Employees using company transport");
        }


    }
    public static int findCountOfEmployeesUsingCompTransport(EmployeeTransport[] employees , String branchSearch){
        int countTransport = 0;
        for(EmployeeTransport employee : employees){
            if((employee.getBranch().equals(branchSearch)) && (employee.getCompanyTransport()) ){
                countTransport ++;
            }
        }
        return countTransport;

    }

    public static EmployeeTransport findEmployeeWithSecondHighestRating(EmployeeTransport[] employees) {
        List<EmployeeTransport> nonCompanyTransportEmployees = new ArrayList<>();

        for (EmployeeTransport employee : employees) {
            if (!employee.getCompanyTransport()) {
                nonCompanyTransportEmployees.add(employee);
            }
        }

        if (nonCompanyTransportEmployees.size() < 2) {
            return null;
        }

        nonCompanyTransportEmployees.sort((e1, e2) -> Double.compare(e2.getRating(), e1.getRating()));
        return nonCompanyTransportEmployees.get(1);

    }
}
