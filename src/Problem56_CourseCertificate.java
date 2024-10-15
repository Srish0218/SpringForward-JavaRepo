/*
Create a Class Course with below attributes:

CourseId - Int
CourseName - String
CourseRating - double
Mode - String
HaveCertificate - boolean

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - CountCourse in Solution class.

This method will take a String parameter and a double parameter along with the other parameter as array of Course objects.
The method will return the total number of courses which have certificate facility and the rating of the course object is greater
than or equal to the given parameter with match the mode(with case insensitive search).

If no count is there then print "No course found".

Consider below sample input and output:

Input 1:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
3
Online


Output 1:
------------
1
=========================================
Input 2:
------------
1001
Java
5
Online
True
1002
Python
3
Offline
False
1003
HTML
4
Offline
True
1004
JavaScript
2
Online
False
5
Offline

Output 2:
-------------
No course found
 */


import java.util.Scanner;

class  CourseCertificate{
    private int CourseId;
    private String CourseName;
    private double CourseRating;
    private String Mode;
    private boolean HaveCertificate;

    public CourseCertificate(int courseId, String courseName, double courseRating, String mode, boolean haveCertificate) {
        CourseId = courseId;
        CourseName = courseName;
        CourseRating = courseRating;
        Mode = mode;
        HaveCertificate = haveCertificate;

    }

    public double getCourseRating() {
        return CourseRating;
    }

    public boolean isHaveCertificate() {
        return HaveCertificate;
    }

    public String getMode() {
        return Mode;
    }
}

public class Problem56_CourseCertificate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course details: ");
        CourseCertificate[] courses = new CourseCertificate[4];
        for(int i = 0;i < courses.length; i++){
            System.out.print("Enter Course ID: ");
            int courseId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Course Name: ");
            String courseName = sc.nextLine();
            System.out.print("Enter Course Rating: ");
            double courseRating = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Mode: ");
            String mode = sc.nextLine();
            System.out.print("Enter Have Certificate: ");
            boolean haveCertificate = sc.nextBoolean();
            sc.nextLine();
            courses[i] = new CourseCertificate(courseId, courseName, courseRating, mode, haveCertificate);
        }

        System.out.println("Enter course rating parameter: ");
        double courseRating = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter mode parameter: ");
        String modeParameter = sc.nextLine();

        int courseCount = CountCourse(courses , courseRating , modeParameter);
        System.out.println(courseCount > 0 ? courseCount : "No course found");




    }
    public static int CountCourse(CourseCertificate[] courses, double courseRating , String mode) {
        int count = 0;
        for(CourseCertificate course : courses){
            if((course.getCourseRating() >= courseRating) && (course.isHaveCertificate()) && course.getMode().equalsIgnoreCase(mode)){
                count++;
            }
        }
        return count;
    }
}
