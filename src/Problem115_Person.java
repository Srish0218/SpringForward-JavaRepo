import java.util.*;

/*
Create a class Person with the following attributes:

firstName - String
lastName - String
age - int
gender - char ('M' for male and 'F' for female)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Student that extends the Person class and adds the following attributes:

rollNo - String
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Faculty that extends the Person class and adds the following attributes:

employeeId - String
department - String
designation - String
salary - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - findHighestGPAStudent and findHighestPaidFaculty in Solution class.

findHighestGPAStudent method:
This method will take an array of Student objects as input.
The method will return the Student object with the highest GPA.
If the array is empty, the method should return null.

findHighestPaidFaculty method:
This method will take an array of Faculty objects as input.
The method will return the Faculty object with the highest salary.
If the array is empty, the method should return null.

These above mentioned static methods should be called from the main method.

For findHighestGPAStudent method - The main method should print the roll number, course and GPA of the returned Student object.
If the returned value is null then it should print "Sorry - No student is available".

For findHighestPaidFaculty method - The main method should print the employee ID, department and salary of the returned
Faculty object.
If the returned value is null then it should print "Sorry - No faculty is available".

Before calling these static methods in main, use Scanner object to read the values of two Student objects and two Faculty
objects referring attributes in the above mentioned attribute sequence.

Example Input:

First1
Last1
20
M
Roll1
Course1
2
3.8
First2
Last2
21
F
Roll2
Course2
3
3.9
Faculty1
Last3
35
M
ID1
Department1
Associate Professor
90000.0
Faculty2
Last4
40
F
ID2
Department2
Professor
100000.0

Output:

Roll2
Course2
3.9
ID2
Department2
100000.0
 */

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender; // ('M' for male and 'F' for female)

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}

class Students extends Person {
    private String rollNo;
    private String course;
    private int semester;
    private double GPA;

    public Students(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender); // Call to superclass constructor
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public int getSemester() {
        return semester;
    }

    public double getGPA() {
        return GPA;
    }
}

class Faculty extends Person {
    private String employeeId;
    private String department;
    private String designation;
    private double salary;

    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary) {
        super(firstName, lastName, age, gender); // Call to superclass constructor
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

public class Problem115_Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        Students[] students = new Students[2];
        Faculty[] faculties = new Faculty[2];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastName = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter gender: ");
            char gender = sc.next().charAt(0);
            System.out.println("Enter roll no: ");
            String rollNo = sc.nextLine();
            System.out.println("Enter course: ");
            String course = sc.nextLine();
            System.out.println("Enter semester: ");
            int semester = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter gpa: ");
            double GPA = sc.nextDouble();
            sc.nextLine();
            students[i] = new Students(firstName  , lastName , age, gender, rollNo, course, semester, GPA);


        }
        for (int i = 0; i < faculties.length; i++) {
            System.out.println("Enter first name: ");
            String firstName = sc.next();
            System.out.println("Enter last name: ");
            String lastName = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter gender: ");
            char gender = sc.next().charAt(0);
            System.out.println("Enter employee ID: ");
            String employeeId = sc.nextLine();
            System.out.println("Enter department ID: ");
            String department = sc.nextLine();
            System.out.println("Enter designation ID: ");
            String designation = sc.nextLine();
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            faculties[i] = new Faculty(firstName , lastName , age , gender , employeeId , department , designation , salary);
        }
        Students highestGPAStudent = findHighestGPAStudent(students);
        if (highestGPAStudent != null) {
            System.out.println(highestGPAStudent.getRollNo());
            System.out.println(highestGPAStudent.getCourse());
            System.out.println(highestGPAStudent.getGPA());
        } else {
            System.out.println("Sorry - No student is available");
        }

        Faculty highestPaidFaculty = findHighestPaidFaculty(faculties);
        if (highestPaidFaculty != null) {
            System.out.println(highestPaidFaculty.getEmployeeId());
            System.out.println(highestPaidFaculty.getDepartment());
            System.out.println(highestPaidFaculty.getSalary());
        } else {
            System.out.println("Sorry - No faculty is available");
        }

        sc.close();

    }
    public static Students findHighestGPAStudent(Students[] students) {
        Students highestGPAStudent = null;
        for(Students student : students) {
            if(highestGPAStudent == null || student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }
    public static Faculty findHighestPaidFaculty(Faculty[] faculties) {
        Faculty highestPaidFaculty = null;
        for(Faculty faculty : faculties) {
            if(highestPaidFaculty == null || faculty.getSalary() > highestPaidFaculty.getSalary()) {
                highestPaidFaculty = faculty;
            }
        }
        return highestPaidFaculty;
    }
}
