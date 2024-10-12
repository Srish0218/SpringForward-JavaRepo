//
//Create a class called Student with the below attributes:
//
//rollNo - int
//name - String
//branch - String
//score - double
//dayScholar - boolean
//
//The above attributes should be private, write getters, setters and parameterized constructor as required.
//
//        Create class Solution with main method.
//Implement two static methods -findCountOfDayscholarStudents  and findStudentwithSecondHighestScore in Solution
//class.
//
//findCountOfDayscholarStudents:
//
//This method will take an array of Student objects as an input parameter . This method will calculate and return
//the count of Students whose score is greater than 80 and who are all from dayScholar.
//
//If no Student scored greater than 80 and from dayScholar are present in the array of Student objects, then the
//method should return 0.
//
//findStudentwithSecondHighestScore:
//
//This method will take an array of Student objects as an input parameter. This method will return the object
//of the second highest score student from the array of Student objects who are not from the dayScholar.
//
//If no Student is a dayScholar  in the array of Student objects, then the method should return null.
//
//Note : All the searches should be case insensitive.
//
//The combination of dayScholar and score for each student is always unique.
//
//The above mentioned static methods should be called from the main method.
//
//For findCountOfDayscholarStudents method - The main method should print the returned count as it is
//if the returned value is greater than 0, else it should print "There are no such dayscholar students".
//
//For findStudentwithSecondHighestScore method - The main method should print the rollNo, name and score
//in the below format from the returned object if the retuned value is not null.
//
//rollNo#name#score
//
//If the returned value is null, then it should print ”There are no student from non day scholar”
//
//Before calling these static methods in main, use Scanner object to read the values of four Student
//objects referring attributes in the above mentioned attribute sequence.
//Consider below sample input and output:
//
//Input:
//
//        1001
//Ashwa
//        IT
//85
//        true
//        1002
//Preeti
//        IT
//70
//        false
//        1003
//Uma
//        ECE
//85
//        false
//        1004
//Akash
//        EEE
//90
//        true
//
//
//Output:
//        2
//        1002#Preeti#70.0

import java.util.*;

class StudentDayScholar{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public StudentDayScholar(int rollNo, String name, String branch, double score, boolean dayScholar){
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;

    }

    public boolean isDayScholar() {
        return this.dayScholar;
    }
    public double getScore(){
        return this.score;
    }

    @Override
    public String toString() {
        return rollNo + "#" + name + "#" + score;
    }
}
public class Problem25_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details: ");
        StudentDayScholar[] students = new StudentDayScholar[4];
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter roll no: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter branch: ");
            String branch = sc.nextLine();
            System.out.println("Enter score: ");
            double score = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter day scholar: ");
            boolean dayScholar = sc.nextBoolean();
            sc.nextLine();

            students[i] = new StudentDayScholar(rollNo, name, branch, score, dayScholar);
        }
        System.out.println("Output: ");
        int countDayScholar = findCountOfDayscholarStudents(students);
        System.out.println(countDayScholar > 0 ? countDayScholar : "There are no such dayscholar students");

        StudentDayScholar nonDayScholarSecondHighestScore = findStudentwithSecondHighestScore(students);
        System.out.println(nonDayScholarSecondHighestScore == null ? "There are no student from non day scholar" : nonDayScholarSecondHighestScore);


    }
    public static int findCountOfDayscholarStudents(StudentDayScholar[] students){
        int dayScholarCount = 0;
        for(StudentDayScholar student: students){
            if(student.isDayScholar() && student.getScore() > 80 ){
                dayScholarCount++;
            }
        }
        return dayScholarCount;
    }
    public static StudentDayScholar findStudentwithSecondHighestScore(StudentDayScholar[] students){
        List<StudentDayScholar> studentsWithSecondHighestScore = new ArrayList<>();
        for(StudentDayScholar student: students){
            if(!student.isDayScholar()){
                studentsWithSecondHighestScore.add(student);
            }
        }
        if(studentsWithSecondHighestScore.isEmpty()){
            return null;
        }
        studentsWithSecondHighestScore.sort((s1 , s2) -> Double.compare(s2.getScore(), s1.getScore()));
        return studentsWithSecondHighestScore.get(1);
    }
}
