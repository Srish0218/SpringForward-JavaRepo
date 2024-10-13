/*
Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month
for input parameters.The method will find out all Students from the given grade and month.
This method will return array of Student object assending based on their rollNo if found.
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The
length of the list], if the returned value is not null. If the returned value is null then
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found

 */



import java.util.*;

class StudentGrade{
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;               // [DD/MM/YYYY]

    public StudentGrade(int rollNo, String name, String subject, char grade, String date){
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }
    public int getMonth(){
        return Integer.parseInt(this.date.split("/")[1]);
    }

    public char getGrade() {
        return grade;
    }

    public int getRollNo() {
        return rollNo;
    }
    public String toString() {
        return name + "\n" + subject;
    }
}

public class Problem40_StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student detail: ");
        StudentGrade[] std = new StudentGrade[4];
        for(int i = 0; i < std.length; i++){
            System.out.println("Enter the Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Name: ");
            String name = sc.nextLine();
            System.out.println("Enter the Subject: ");
            String subject = sc.nextLine();
            System.out.println("Enter the Grade: ");
            char grade = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Enter the Date: ");
            String date = sc.nextLine();
            std[i] = new StudentGrade(rollNo , name , subject , grade , date);
        }

        System.out.println("Enter grade parameter: ");
        char gradeParameter = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter the month parameter: ");
        int monthParameter = sc.nextInt();

        System.out.println("Output: ");

        List<StudentGrade> studentByGradeAndMonth = findStudentByGradeAndMonth(std , gradeParameter , monthParameter);
        if(studentByGradeAndMonth == null){
            System.out.println("No Students Found");
        }else {
            for(StudentGrade student : studentByGradeAndMonth){
                System.out.println(student);
            }
            System.out.println(studentByGradeAndMonth.size());
        }


    }
    public static List<StudentGrade> findStudentByGradeAndMonth(StudentGrade[] std, int gradeParameter, int monthParameter){
        List<StudentGrade> studentsByGradeMonth = new ArrayList<>();
        for(StudentGrade student : std){
            if (student.getGrade() == gradeParameter && student.getMonth() == monthParameter){
                studentsByGradeMonth.add(student);
            }
        }
        if(studentsByGradeMonth.size() == 0){
            return null;
        }
        studentsByGradeMonth.sort((s1 , s2) -> Integer.compare(s1.getRollNo() , s2.getRollNo()));
        return studentsByGradeMonth;
    }
}
