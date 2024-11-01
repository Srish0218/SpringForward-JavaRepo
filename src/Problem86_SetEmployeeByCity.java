/* Group the employees by city

 * Input:
 * ----------------
 * Employee |      City
 * ---------------------
 * Arijit       Kolkata
 * Minaz        Mumbai
 * Rahul        Chennai
 * Rajesh       Kolkata
 * Sekhar       Chennai
 * Kasim        Chennai

 * Output:
 * ----------------
 * Kolkata: Arijit,Rajesh
 * Mumbai: Minaz
 * Chennai: Rahul,Sekhar,Kasim
 */

import java.util.*;

public class Problem86_SetEmployeeByCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String , String> employees = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name: ");
            String name = sc.nextLine();
            System.out.println("Enter employee city: ");
            String city = sc.nextLine();
            if (employees.containsKey(city)) {
                employees.put(city, employees.get(city) + ", " + name);
            }else {
                employees.put(city, name);
            }
        }
//        System.out.println(employees);
        System.out.println("Employees: ");
        for (String city : employees.keySet()) {
            System.out.println(city + ": " + employees.get(city));
        }
    }
}
