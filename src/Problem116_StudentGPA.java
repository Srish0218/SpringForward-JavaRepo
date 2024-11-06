/*
Create a class Student with the following attributes:

name - String
rollNo - String
age - int
gender - char ('M' for male and 'F' for female)
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateAverageGPA and getStudentsByCourse in Solution class.

calculateAverageGPA method:
This method will take an array of Student objects as input.
The method will return the average GPA of all the students in the array.
If the array is empty, the method should return 0.

getStudentsByCourse method:
This method will take two input parameters - array of Student objects and a course (string).
The method will return an array of Student objects that are enrolled in the specified course.
If no student with the given course is present in the array of Student objects, then the method should return an empty array.

These above mentioned static methods should be called from the main method.

For calculateAverageGPA method - The main method should print the average GPA returned by the method.
If the returned value is 0, then it should print "Sorry - No students are available".

For getStudentsByCourse method - The main method should print the name, roll number and GPA of the returned Student objects.
If the returned value is an empty array, then it should print "Sorry - No students are available for the given course".

Before calling these static methods in main, use Scanner object to read the values of four Student objects referring
attributes in the above mentioned attribute sequence. Next, read the value for a course.

Example Input:
------------------------
John
1234
20
M
CSE
2
3.5
Alice
5678
19
F
EEE
1
3.7
Bob
9101
21
M
CSE
4
3.9
Sarah
2345
20
F
ME
3
3.2
CSE

Example Output:
---------------------------
3.6
John
1234
3.5
Bob
9101
3.9
 */



import java.util.*;

class StudentGPA{
    private String name;
    private String rollNo;
    private int age;
    private char gender; // ('M' for male and 'F' for female)
    private String course;
    private int semester;
    private double GPA;

    public StudentGPA(String name, String rollNo, int age, char gender, String course, int semester, double GPA){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }
    public String getName(){
        return name;
    }
    public String getRollNo(){
        return rollNo;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getCourse(){
        return course;
    }
    public int getSemester(){
        return semester;
    }
    public double getGPA(){
        return GPA;
    }
}

public class Problem116_StudentGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the students : ");
        StudentGPA[] students = new StudentGPA[sc.nextInt()];
        for(int i = 0; i < students.length; i++){
            System.out.print("Enter the name of the student : ");
            String name = sc.next();
            System.out.print("Enter the roll no : ");
            String rollNo = sc.next();
            System.out.print("Enter the age : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the gender : ");
            char gender = sc.next().charAt(0);
            System.out.print("Enter the course : ");
            String course = sc.next();
            System.out.print("Enter the semester : ");
            int semester = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the GPA : ");
            double GPA = sc.nextDouble();
            sc.nextLine();

            students[i] = new StudentGPA(name , rollNo , age, gender, course, semester, GPA);
        }
        System.out.println("Enter course parameter: ");
        String courseParameter = sc.nextLine();

        double averageGPA = calculateAverageGPA(students);
        System.out.println(averageGPA != 0 ? averageGPA : "Sorry - No students are available");

        ArrayList<StudentGPA> studentDetailsByCourse = getStudentsByCourse(students ,courseParameter);
        if(studentDetailsByCourse.isEmpty()){
            System.out.println("Sorry - No students are available for the given course");
        }else{
            for(StudentGPA studentDetail : studentDetailsByCourse){
                System.out.println(studentDetail.getName() + "\n" + studentDetail.getRollNo() + "\n" + studentDetail.getGPA());

            }
        }


    }
    public static double calculateAverageGPA(StudentGPA[] students){
        double sum = 0;
        for(StudentGPA student : students){
            sum += student.getGPA();
        }
        return sum / students.length;
    }
    public static ArrayList<StudentGPA> getStudentsByCourse(StudentGPA[] students, String courseParameter){
        ArrayList<StudentGPA> studentDetailsByCourse = new ArrayList<>();
        for(StudentGPA student : students){
            if(student.getCourse().equalsIgnoreCase(courseParameter)){
                studentDetailsByCourse.add(student);
            }
        }
        return studentDetailsByCourse;
    }
}
