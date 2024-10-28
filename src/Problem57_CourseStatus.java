/*
Create a Class Course with below attributes:

CourseName - String
Mode - String
Sharedata - boolean

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.CourseNumber - int

Implement static method - findCourseStatus in Solution class.

This method will take a String parameter along with the other parameter as array of Course objects.

The method will return status where the String parameter appears in the side attribute (with case insensitive search).

If the number of the course greater than equal to 1000, print "High", if greater or equal to 500 but less than 1000 then print
"Medium" and if less than 500 then print "Low".

If the taken string not match with the Course name then print "No course found".
Consider below sample input and output:

Input 1:
------------
Java
1200
Online
FalseHTML

Python
600
Offline
False
800
Offline
False
JavaScript
300
Online
True
Python

Output 1:
------------
Medium
=========================================

Input 2:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
PHP

Output 2:
-------------
No course found
 */


import java.util.Scanner;

class CourseStatus{
    private String CourseName;
    private int CourseNumber;
    private String Mode;
    private boolean Sharedata;
    public CourseStatus(String CourseName, int CourseNumber, String Mode, boolean Sharedata){
        this.CourseName = CourseName;
        this.CourseNumber = CourseNumber;
        this.Mode = Mode;
        this.Sharedata = Sharedata;

    }
    public String getCourseName(){
        return CourseName;
    }
    public int getCourseNumber(){
        return CourseNumber;
    }
}

public class Problem57_CourseStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course details: ");
        CourseStatus[] courses = new CourseStatus[4];
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter Course name: ");
            String CourseName = sc.nextLine();
            System.out.println("Enter Course number: ");
            int CourseNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Mode: ");
            String Mode = sc.nextLine();
            System.out.println("Enter Sharedata: ");
            boolean Sharedata = sc.nextBoolean();
            sc.nextLine();
            courses[i] = new CourseStatus(CourseName, CourseNumber, Mode, Sharedata);
        }
        System.out.println("Enter course name parameter: ");
        String courseNameParameter = sc.nextLine();

        System.out.println("Output: ");

        String status = findCourseStatus(courses, courseNameParameter);
        System.out.println(status == null ? "No course found" : status);

    }
    public static String findCourseStatus(CourseStatus[] courses , String courseNameParaeter){
        for(CourseStatus course : courses){
            if(course.getCourseName().equalsIgnoreCase(courseNameParaeter)){
                return getStatus(course);
            }
        }
        return null;
    }
    @org.jetbrains.annotations.NotNull
    public static String getStatus(CourseStatus course){
        if(course.getCourseNumber() >= 1000){
            return "High";
        }else if (course.getCourseNumber() >= 500 && course.getCourseNumber() <= 1000){
            return "Medium";
        }else {
            return "Low";
        }
    }
}
