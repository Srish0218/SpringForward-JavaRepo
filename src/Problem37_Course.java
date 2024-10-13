/*
create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
 */


import java.util.*;

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }
    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }
    public int getHandson() {
        return handson;
    }
    public String toString(){
        return courseName;
    }
}

public class Problem37_Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course details: ");
        Course[] courses = new Course[4];
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter Course ID: ");
            int courseId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Course Name: ");
            String courseName = sc.nextLine();
            System.out.println("Enter Course Admin: ");
            String courseAdmin = sc.nextLine();
            System.out.println("Enter Quiz: ");
            int quiz = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Handson: ");
            int handson = sc.nextInt();
            sc.nextLine();
            courses[i] = new Course(courseId, courseName, courseAdmin, quiz, handson);
        }
        System.out.println("Enter course admin parameter: ");
        String adminParameter = sc.nextLine();
        System.out.println("Enter course handson parameter: ");
        int handsonParameter = sc.nextInt();
        sc.nextLine();

        int AvgOfQuizByAdmin = findAvgOfQuizByAdmin(courses , adminParameter);
        System.out.println(AvgOfQuizByAdmin > 0 ? AvgOfQuizByAdmin : "No Course found.");
        List<Course> courseByHanson = sortCourseByHandsOn(courses , handsonParameter);
        if (courseByHanson == null) {
            System.out.println("No Course found with mentioned attribute.");
        }else {
            for (Course course : courseByHanson) {
                System.out.println(course);
            }
        }



    }
    public static int findAvgOfQuizByAdmin(Course[] courses, String adminParameter) {
        int sumOfQuiz = 0;
        int courseCount = 0;


        for (Course course : courses) {
            if(course.getCourseAdmin().equals(adminParameter)) {
                courseCount++;
                sumOfQuiz += course.getQuiz();

            }
        }
        return sumOfQuiz/courseCount;
    }

    public static List<Course> sortCourseByHandsOn(Course[] courses, int handsonParameter) {
        List<Course> courseList = new ArrayList<>();
        for (Course course : courses) {
            if(course.getHandson() < handsonParameter) {
                courseList.add(course);
            }
        }
        courseList.sort((s1 , s2) -> Integer.compare(s1.getHandson(), s2.getHandson()));
        return courseList == null ? null : courseList;
    }
}
